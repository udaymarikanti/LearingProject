package Hospital;

public class ProjectDetails {
    String softWare;
    String companeyName;

    CompanyDetails companyDetails;



    public ProjectDetails(String  softWare, String companeyName, CompanyDetails companyDetails){
        this.softWare = softWare;
        this.companeyName = companeyName;
        this.companyDetails = companyDetails;


    }
    public ProjectDetails(String  softWare, String companeyName){
        this(softWare,companeyName,new CompanyDetails());
    }


    @Override
    public String toString() {
        return "ProjectDetails{" +
                "softWare='" + softWare + '\'' +
                ", companeyName='" + companeyName + '\'' +
                ", companyDetails=" + companyDetails +
                '}';
    }
}
