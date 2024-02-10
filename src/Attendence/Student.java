package Attendence;

public class Student {

    public String name;
    public  String fatherName;
    public String mobilNumber;
    public  String dataOfBirth;

    public  String schoolName;
    public  Days days;
    public  String StudentAttendence;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", days=" + days +
                ", StudentAttendence='" + StudentAttendence + '\'' +
                '}';
    }
}
