// Base abstract class for all students
public abstract class Student {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public Student(String studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Each student type calculates tuition differently
    public abstract double calculateTuition();

    public abstract String getStudentType();

    public abstract void displayStudentDetails();
}
