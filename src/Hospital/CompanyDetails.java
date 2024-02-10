package Hospital;

public class CompanyDetails {
  public  String projectNmae;
  public String compenyName;


    public CompanyDetails(){
        projectNmae = "FrentEnd";
        compenyName = "TCS";
    }

    @Override
    public String toString() {
        return "CompanyDetails{" +
                "projectNmae='" + projectNmae + '\'' +
                ", compenyName='" + compenyName + '\'' +
                '}';
    }
}

