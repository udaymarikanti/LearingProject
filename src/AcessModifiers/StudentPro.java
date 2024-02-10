package AcessModifiers;

import ProtectedAcces.Proctected;

public class StudentPro extends Proctected {

    public  String classStudent;


    public StudentPro(String name, String fName, String dob,String classStudent ) {
        super(name, fName, dob);
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "StudentPro{" +
                "classStudent='" + classStudent + '\'' +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
