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

    int c = 0;
    int a = 2;
    int b = 3;

    int d = 0;
    public int squre(){

        c = (a+b)*(a+b);
        d = a*a +b* b +2 *(a *b);
        System.out.println(d+ "   using formula");

        return c;




    }






}
