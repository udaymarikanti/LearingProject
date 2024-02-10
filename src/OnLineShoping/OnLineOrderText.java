package OnLineShoping;

public class OnLineOrderText {

    public static void main(String[] args){

        LoginProcess loginProcess = new LoginProcess();
        LoginDetails loginDetails = new LoginDetails("uday@gmail.com","1234");
          boolean loginStatus = loginProcess.loginProcess(loginDetails);
        OrderBookService bookService  = new OrderBookService();
        System.out.println(loginStatus);
        Orders orders = new Orders(new Products("apple",40000,2),2);
        String numberOfOrdeeras = bookService.OrderProcess(orders,loginDetails);
        System.out.println(numberOfOrdeeras);




    }


}
