package MailDemo;

public class MailTest {
    public  static  void main(String[] args){
        MailProcessService mailService = new MailProcessService();
       // MailDetails mailDetails = new MailDetails("uday@gmail.com","1234");
        MailDetails mailDetails = new MailDetails("Kiran@gmail.com","1234");

        MailProcess mailProcess = new MailProcess();
        String login = mailProcess.MailProcess(mailDetails);
      //  boolean login = mailService.LoginStatus(mailDetails);
        System.out.println(login);



//        mailDetails.mailId ="uday@gmail.com";
//        mailDetails.password = "1234";
//        MailDetails mailDetails1 = new MailDetails("kiran@gmail.com","4567");
//
//        String messagre= mailService.MailProcessing(mailDetails).toString();
//        String messagre2= mailService.MailProcessing(mailDetails1).toString();
//
//
//        System.out.println(mailService.toString());
//        System.out.println(messagre);
//        System.out.println(messagre2);

    }
}
