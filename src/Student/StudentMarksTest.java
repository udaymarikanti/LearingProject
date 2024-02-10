package Student;

public class StudentMarksTest {

    public static void main(String[] args) {
        StudentMarksService marksService = new StudentMarksService();
        StudentDeatils studentDeatils = new StudentDeatils();
        studentDeatils.studentMarks = 55;
        System.out.println(studentDeatils.hashCode());

        String  message = marksService.StudentMarksProcess(studentDeatils);
        System.out.println(message);
        System.out.println(studentDeatils.studentMarks);

        int num = marksService.squre();
        System.out.println(num + " by adding ") ;


    }

}
