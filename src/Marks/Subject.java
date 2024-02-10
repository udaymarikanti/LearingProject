package Marks;

public class Subject {
    String subjectNmae;
    int marks;
    public  String resultSubject;

    public Subject(String subjectNmae, int marks ) {
        this.subjectNmae = subjectNmae;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "subjectNmae='" + subjectNmae + '\'' +
                ", marks=" + marks +
                ", resultSubject='" + resultSubject + '\'' +
                '}';
    }
}
