package Marks;

import School.StudentAdress;

public class Student {
    public String name;
    public  String fatherName;
    public String mobilNumber;
    public  String dataOfBirth;

    public  String schoolName;
    public Marks marks;
    public  String result;

    public Student(String name, String fatherName, String mobilNumber, String dataOfBirth, String schoolName, Marks marks, int days) {
        this.name = name;
        this.fatherName = fatherName;
        this.mobilNumber = mobilNumber;
        this.dataOfBirth = dataOfBirth;
        this.schoolName = schoolName;
        this.marks = marks;

      //  this.days = days;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
