package Attendence;

public class AttendenceTest {




    public  boolean studentPer(Month month){

       int  per = (month.days/ month.totalDays) * 100;
        return per > 60;
    }

    public boolean allMonths(Days days){
      int numberOfDays =  (days.jan.days + days.feb.days +days.mar.days + days.april.days + days.may.days + days.jun.days +days.july.days +days.aug.days + days.sept.days +days.oct.days +days.nove.days +days.dec.days);
        int totalWorkingDays = (days.jan.totalDays + days.feb.totalDays +days.mar.totalDays + days.april.totalDays + days.may.totalDays + days.jun.totalDays +days.july.totalDays +days.aug.totalDays + days.sept.totalDays +days.oct.totalDays +days.nove.totalDays +days.dec.totalDays) ;

     days.overAll = (numberOfDays/totalWorkingDays) * 100;
      return days.overAll>60;


    }
    public Student studentAtendence(Student student){
        if (allMonths(student.days)){
              student.StudentAttendence ="greter then 60 %";
        }else
            student.StudentAttendence = " Atendence persange less then 60";

        return student;
    }


    public static void main(String[] args) {
        Month janMonth = new Month("jan",22,26);

        Month febMonth = new Month("feb",24,28);

        Month marchMonth = new Month("march",22,24);

        Month aprilMonth = new Month("april", 25,29);

        Month mayMonth = new Month("may", 28,31);

        Month junMonth = new Month("jun",21,24);

        Month julyMonth = new Month("july",20,28);

        Month augMonth = new Month("aug",22,25);

        Month septMonth = new Month("sept",26,28);

        Month octMonth = new Month("oct",23,26);

        Month noveMonth = new Month("nove", 27,29);

        Month decMonth = new Month("Dec",26,29);


       Days days = new Days(janMonth,febMonth,marchMonth,aprilMonth,mayMonth,junMonth,julyMonth,augMonth,septMonth,octMonth,noveMonth,decMonth);

       Student udayStudent = new Student();
       udayStudent.days = days;
       udayStudent.name = "uday";
       udayStudent.fatherName = "narasimha rao";
       udayStudent.dataOfBirth ="10/12/2020";
       udayStudent.mobilNumber ="98487595";
       udayStudent.schoolName ="high school";

       AttendenceTest attendenceTest = new AttendenceTest();
       Student newstudent =  attendenceTest.studentAtendence(udayStudent);
        System.out.println(newstudent);






    }

}
