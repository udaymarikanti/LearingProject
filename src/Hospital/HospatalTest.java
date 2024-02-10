package Hospital;

public class HospatalTest {
    public  static  void  main(String[] args){
        CompanyDetails companyDetails = new CompanyDetails();
        companyDetails.compenyName = "HCL";
        companyDetails.projectNmae = "BackEnd";

        ProjectDetails frentEnd = new ProjectDetails("Java","TCS",companyDetails);
        System.out.println(frentEnd);

        ProjectDetails frentEndNew = new ProjectDetails("Java","TCS");
        System.out.println(frentEndNew);


    }


}
