package BankAccout;

public class CardProcessService {
    boolean login(CardDetails card){
        System.out.println(card.hashCode());

        String localCardNumber = "1234 1234 1234";
        String localPinNumber = "1234";

        if(localCardNumber.equals(card.cardNumber) && localPinNumber.equals(card.pinNumber)){
            return  true;

        } else {
            return  false;
        }

    }
}
