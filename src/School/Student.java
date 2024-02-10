package School;


public class Student {
   public String name;
    public  String fatherName;
    public String mobilNumber;
    public  String dataOfBirth;
    StudentAdress Adress;
    public  String schoolName;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", studentAdress=" + Adress +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
