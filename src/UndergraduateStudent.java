// Undergraduate student class
public class UndergraduateStudent extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double pricePerCredit = 1500;
        double total = creditHours * pricePerCredit;

        total = total - scholarshipAmount;

        return total;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("------ Undergraduate Student ------");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: R" + scholarshipAmount);
        System.out.println("Total Tuition: R" + calculateTuition());
        System.out.println("-----------------------------------");
    }

    // Builder class
    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder setCreditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
