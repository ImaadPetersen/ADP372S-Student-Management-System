public class Main {

    public static void main(String[] args) {

        UndergraduateStudent student1 =
                new UndergraduateStudent.Builder(
                        "U101",
                        "Imaad Petersen",
                        "imaad@email.com",
                        "Information Technology")
                        .setCreditHours(6)
                        .setScholarshipAmount(3000)
                        .build();

        GraduateStudent student2 =
                new GraduateStudent.Builder(
                        "G202",
                        "Sarah Daniels",
                        "sarah@email.com",
                        "Computer Science")
                        .setResearchAssistant(true)
                        .setStipend(8000)
                        .build();

        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
