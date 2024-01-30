package BankAccout;

public class CreditService {

    int balance ;

  public   int credit(String accountNumber,int amount ) {

      int localBalance = 0;
      String  localAccountNumber = "1234 1234 1234";
      if (localAccountNumber.equals(accountNumber)) {
          balance = balance+amount;

          }
      localBalance = balance;
        return balance;
      }
  }

