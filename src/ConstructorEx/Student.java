package ConstructorEx;

public class Student {

    public String name;
    public  String fatherName;
    public String mobilNumber;
    public  String dataOfBirth;
    public  Adress adress;

    public  Student(String name,String fatherName,String mobilNumber,String dataOfBirth,
                    Adress adress){
        this.name =name;
        this.fatherName = fatherName;
        this.mobilNumber =mobilNumber;
        this.dataOfBirth = dataOfBirth;
        this.adress = adress;
    }
    public Student (String name,String fatherName,String mobilNumber,String dataOfBirth){
        this(name,fatherName,mobilNumber,dataOfBirth,new Adress());

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", adress=" + adress +
                '}';
    }
}
