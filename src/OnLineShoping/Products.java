package OnLineShoping;

public class Products {
    String nameOfProduct;
    int price;
    int quantity;

    public Products(String nameOfProduct, int price, int quantity) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


