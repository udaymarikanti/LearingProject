
package Marks;

public class StudentMarksTest {

public  boolean isPass(Subject subject){
  System.out.println("from isPass    " + subject.subjectNmae);
  return subject.marks >= 35;
}

  public  boolean isPassInHindi(Subject subject){
    System.out.println("from isPass   " + subject.subjectNmae);
    return subject.marks >= 21;
  }
  public boolean attandanceResult(){
  return  true;
  }


  public  Student getResult(Student studentInput) {  //this mehod is check the each subject

    if (isPass(studentInput.marks.teluguSubject)) {
      studentInput.marks.teluguSubject.resultSubject = "Pass";
    } else
      studentInput.marks.teluguSubject.resultSubject = "Fail";

  if(isPassInHindi(studentInput.marks.hindiSubject)){
    studentInput.marks.hindiSubject.resultSubject = "Pass";

  }else
    studentInput.marks.hindiSubject.resultSubject = "Fail";

  if (isPass(studentInput.marks.englishSubject)){
    studentInput.marks.englishSubject.resultSubject = "Pass";
  }else{
    studentInput.marks.englishSubject.resultSubject = "Fail";
  }
    if (isPass(studentInput.marks.mathsSubject)){
      studentInput.marks.mathsSubject.resultSubject = "Pass";
    }else{
      studentInput.marks.mathsSubject.resultSubject = "Fail";
    }
    if (isPass(studentInput.marks.scienceSubject)){
      studentInput.marks.scienceSubject.resultSubject = "Pass";
    }else{
      studentInput.marks.scienceSubject.resultSubject = "Fail";
    }
    if (isPass(studentInput.marks.socialSubject)){
      studentInput.marks.socialSubject.resultSubject = "Pass";
    }else{
      studentInput.marks.socialSubject.resultSubject = "Fail";
    }

    if (studentInput.marks.teluguSubject.resultSubject.equals("Pass")
            && studentInput.marks.hindiSubject.resultSubject.equals("Pass")
            && studentInput.marks.englishSubject.resultSubject.equals("Pass")
            && studentInput.marks.mathsSubject.resultSubject.equals("Pass")
            && studentInput.marks.scienceSubject.resultSubject.equals("Pass")
            && studentInput.marks.socialSubject.resultSubject.equals("Pass")
           //&& studentInput.days >=25
    ){
      studentInput.result = "Pass";
    }else {
      studentInput.result = "Fail";
    }
    
    return studentInput;
  }
 // public  Student getResult(Student studentInput) {  //this method is check the over all student pass or fail

//    if (studentInput.marks.teluguSubject.marks >= 35 &&
//            studentInput.marks.hindiSubject.marks >= 21 &&
//            studentInput.marks.englishSubject.marks >= 35 &&
//            studentInput.marks.mathsSubject.marks >= 35 &&
//            studentInput.marks.scienceSubject.marks >= 35 &&
//            studentInput.marks.socialSubject.marks >= 35
//    ){
//      studentInput.result = "Pass";
//    }else {
//      studentInput.result ="Fail";
//    }
//    return  studentInput;
//  }
//  }



  public static void main(String[] args) {


    Subject teluguSubject = new Subject("telugu",40);

    Subject englishSubject = new Subject("english", 44);

    Subject hindiSubject = new Subject("hindi", 56);

    Subject mathsSubject = new Subject("maths",90);

    Subject scienceSubject = new Subject("science",60);

    Subject socialSubject = new Subject("socal",70);


    Marks studentMarks = new Marks(teluguSubject,hindiSubject,englishSubject,mathsSubject,scienceSubject,socialSubject);

    Student udayStudent = new Student("uday","narasimha rao","10/10/2011","984875","high school",studentMarks,10);

  //  int per = (udayStudent.days/ udayStudent.totalDays)*100;

    StudentMarksTest studentMarksTest = new StudentMarksTest();
    Student studentResult =   studentMarksTest.getResult(udayStudent);
    System.out.println(studentResult);



  }
}
