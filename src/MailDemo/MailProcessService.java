package MailDemo;

public class MailProcessService {

   String localMailIdsend = "uday@gamil.com";

    String passwordSend = "1234";

   String localMailIdFRead = "kiran@gmail.com";
    String passwordRead = "4567";
    public boolean LoginStatus(MailDetails mailDetails){
        if(localMailIdsend.equals(mailDetails.mailId)){
            return true;
        }else {
            return false;
        }












  //  public MailDetails MailProcessing(MailDetails mailDetails){
       // MailDetails md = new MailDetails("uday@gmail.com","1234");
//        MailDetails md = new MailDetails(localMailIdFRead,passwordRead);
//
//        if(localMailIdsend.equals(md.mailId) && passwordSend.equals(md.password)){
//            System.out.println("my message ");
//        } else if (localMailIdFRead.equals(md.mailId) && passwordRead.equals(md.password)) {
//            System.out.println("hello how are you");
//        }else {
//            System.out.println("Wrong credentials");
//        }
//        return md;
    }

}
