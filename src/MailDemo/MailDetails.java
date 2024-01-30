package MailDemo;

public class MailDetails {
    public String mailId;
    public String password;

    public MailDetails(String mailId, String password) {
        this.mailId = mailId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "MailDetails{" +
                "mailId='" + mailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
