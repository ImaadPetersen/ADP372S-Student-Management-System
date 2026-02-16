// Graduate student class
public class GraduateStudent extends Student {

    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {

        double baseFee = 30000;

        if (researchAssistant == true) {
            baseFee = baseFee - stipend;
        }

        return baseFee;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("-------- Graduate Student --------");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: R" + stipend);
        System.out.println("Total Tuition: R" + calculateTuition());
        System.out.println("----------------------------------");
    }

    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
