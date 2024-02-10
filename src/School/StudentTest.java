package School;


public class StudentTest {

    public  String getRollNO(Student abc){

        System.out.println( "method  hash code abc refrence " + abc.hashCode());
        return  "15QP1A0335"+abc.toString();
    }

    public  Student getSchoolName(Student student){
        student.schoolName = "normal school";
        return student;
    }
    public Student getStudentClone(Student student){
        Student studentClone = new Student();
        studentClone.name = student.name;
        studentClone.fatherName = student.fatherName;
        studentClone.dataOfBirth = student.dataOfBirth;
        studentClone.schoolName  = "deapCLONESchool";
        System.out.println("method StudentClone " +studentClone.hashCode());
        return studentClone;
    }
    public Student getStudentAdres(Student student){
        Student localstudent = new Student();
        localstudent.name = student.name;
        localstudent.fatherName = student.fatherName;
        localstudent.dataOfBirth = student.dataOfBirth;
        localstudent.mobilNumber  = student.mobilNumber;
        localstudent.schoolName = "high school";
        StudentAdress studentAdress = new StudentAdress();
        studentAdress.city = "USA";
        studentAdress.area = "mainRoad";
        studentAdress.pinCode = "500018";
        localstudent.Adress = studentAdress;
        return localstudent;

    }


    public static void main(String[] args) {


        Student kiranStudent = new Student();
       // StudentAdress adress = new StudentAdress();
        StudentTest studentTest = new StudentTest();



        kiranStudent.name = "kiran";
        kiranStudent.fatherName ="Surya";
        kiranStudent.mobilNumber ="123456";
        kiranStudent.dataOfBirth ="10/01/2024";
       // kiranStudent.Adress = adress;



         Student studentAdress =studentTest.getStudentAdres(kiranStudent);
         System.out.println(studentAdress);




        studentTest.getRollNO(kiranStudent);
        Student  studentLatest =studentTest.getSchoolName(kiranStudent);
        Student studentClone = studentTest.getStudentClone(kiranStudent);
        System.out.println("student latest   " + studentLatest.schoolName);
        System.out.println("student name clone   " +studentClone.schoolName);
        System.out.println("hash code from the " + kiranStudent.hashCode());


        Student shivaStudent = new Student();
        shivaStudent.name = "kiran";
        shivaStudent.fatherName ="Surya";
        shivaStudent.mobilNumber ="123456";
        shivaStudent.dataOfBirth ="10/01/2024";


        System.out.println("kiranSTUDENT  hash code  " + kiranStudent.hashCode());
        String shiva =  studentTest.getRollNO(shivaStudent);
        System.out.println("shiva Student hash code " + shivaStudent.hashCode());
        System.out.println(shiva);

       // StudentValidationTest studentmarks = new StudentValidationTest();
      //  Marks allMarks = new Marks();
      //  kiranStudent.marks = allMarks;
       //  Student udayMarks = studentmarks.studentMarksProcess(kiranStudent);
      //  System.out.println(udayMarks);



//        SchoolNameService nameService = new SchoolNameService();
//        Student kiran =  nameService.schoolNameProcess(kiranStudent);
//        System.out.println(kiran);
//        System.out.println(kiran.hashCode() + "  student hash code for kiran ");
//        System.out.println(kiran.hashCode()+ "  latest name ");
//        System.out.println(kiranStudent.schoolName + "   student school name KiranStudent ");
//         Student deapClone =nameService.schoolNameDeapCloneing(kiranStudent);
//        System.out.println(deapClone.hashCode() + "   hash code from the test of deap clone");

    }

}
