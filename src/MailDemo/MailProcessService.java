package MailDemo;

public class MailProcessService {


    public boolean LoginStatus(MailDetails mailDetails){
        if(mailDetails.localMailIdsend.equals(mailDetails.mailId)){
            System.out.println("your mail is login");
            return true;
        }else {
            System.out.println("your mail is login faild");
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
