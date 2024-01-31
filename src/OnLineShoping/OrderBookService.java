package OnLineShoping;

public class OrderBookService {
    int money = 0;

    public String OrderProcess(Orders orders, LoginDetails loginDetails) {
        LoginProcess loginProcess = new LoginProcess();

        money = orders.getProducts().getPrice() * orders.getProducts().getQuantity();
        if (loginProcess.loginProcess(loginDetails)){

            if (orders.getOrderId() < 0) {
                System.out.println("select your order" + orders.getProducts().toString());
            } else
                System.out.println("your order is " + orders.getProducts().getNameOfProduct() +"price  "+ orders.getProducts().getPrice() +"product  "+ orders.getProducts().getQuantity() +" total "+ money);
            //  return orders.getProducts().getNameOfProduct() +"price  "+ orders.getProducts().getPrice() +"product  "+ orders.getProducts().getQuantity() +" total "+ money;
        }
        return "thanks for Visit";

    }
}


