package ConstructorEx;

public class ConstrutorTest {

    public static void main(String[] args){
        Adress adress = new Adress();
        adress.city ="uppal";
        adress.pinCode = "1234";
        Student student = new Student("uday","narsimha rao","984875","10/10/2020",adress);
        System.out.println(student);

        Student examStudent = new Student("ravi","ramu","9848759565","10/10/1010");
        System.out.println(examStudent);

    }





}
