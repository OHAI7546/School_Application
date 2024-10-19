import model.*;

public class SchoolManagementSystem {

    public static void main(String[] args) {
        Principal principal = new Principal("Mr. Smith", 50);
        Teacher teacher = new Teacher("Ms. Johnson", 35);
        Student student = new Student("Alice", 10);
        Applicant applicant = new Applicant("Bob", 4);
        Course math = new Course("Mathematics");
        ClassRoom class1 = new ClassRoom("5A", teacher, math);


        principal.admitApplicant(applicant);
        principal.admitApplicant(new Applicant("Charlie", 6));

        teacher.teachCourse(math);
        student.takeCourse(math);
        class1.startClass();
        principal.expelStudent(student);


    }
}
