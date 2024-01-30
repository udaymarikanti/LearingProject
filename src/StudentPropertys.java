public class StudentPropertys {
    String studentName;
    String fatherName;
    String mobileNo;
    String dateOfBirth;

    public StudentPropertys(String studentName, String fatherName, String mobileNo, String dateOfBirth) {
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.mobileNo = mobileNo;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "StudentPropertys{" +
                "studentName='" + studentName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
