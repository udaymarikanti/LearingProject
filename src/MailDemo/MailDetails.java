package MailDemo;

public class MailDetails {
    public String mailId;
    public String password;

    String localMailIdsend = "uday@gmail.com";

    String passwordSend = "1234";

    String localMailIdFRead = "kiran@gmail.com";
    String passwordRead = "4567";

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
