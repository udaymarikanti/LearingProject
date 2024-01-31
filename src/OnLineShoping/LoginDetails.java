package OnLineShoping;

public class LoginDetails {
    String mailId ;
    String password;

    public LoginDetails(String mailId, String password) {
        this.mailId = mailId;
        this.password = password;
    }

    public String getMailId() {
        return mailId;
    }

    public String getPassword() {
        return password;
    }
}
