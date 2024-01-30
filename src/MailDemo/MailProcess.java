package MailDemo;

public class MailProcess {

    public String MailProcess(MailDetails mailDetails){
        //String localMailid = "Uday@gmail,com";
        String localMailid = "Kiran@gmail,com";
        String LocalPassword = "1234";
        MailProcessService service = new MailProcessService();
        if (service.LoginStatus(mailDetails)){

         if(localMailid.equals(mailDetails.mailId)){
            return "my message ";

        }else {
            return "hello how are you ";
        }
    }
        return "wrong details";
    }
}
