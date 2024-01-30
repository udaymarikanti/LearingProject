package Student;

public class StudentMarksService {


    static String StudentMarksProcess(StudentDeatils studentDeatils) {


       // String studentName = "kiran";
        String roolNumber = "1234";
        int marks = 35;



       if (studentDeatils.studentMarks >marks){
            return "Student Passed ";
        }
        else {
            return "studentFaild";
        }
    }
}
