package OnLineShoping;

public class Orders {
    Products products;
    int orderId;

    public Orders(Products products, int orderId) {
        this.products = products;
        this.orderId = orderId;
    }

    public Products getProducts() {
        return products;
    }

    public int getOrderId() {
        return orderId;
    }
}
