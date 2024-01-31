package OnLineShoping;

public class LoginProcess {
    String localMailId = "uday@gmail.com";
    String LocalPassword = "1234";
    public  boolean loginProcess(LoginDetails loginDetails){
        if (localMailId.equals(loginDetails.getMailId()) && LocalPassword.equals(loginDetails.getPassword())){
            System.out.println("log in sucess full");
            return  true;
        }else {
           System.out.println("log in faild");

            return false;
        }
    }
}
