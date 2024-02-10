package Rapido;

public class CarDeatails {
    private   String type;
    private   String raidPrice;


    public CarDeatails(){
        type = "BMW";
        raidPrice = "20000";
    }


    public CarDeatails(String type, String carPrice) {
        this.type = type;
        this.raidPrice = carPrice;
    }

    public String getType() {
        return type;
    }

    public String getCarPrice() {
        return raidPrice;
    }

    @Override
    public String toString() {
        return "CarDeatails{" +
                "type='" + type + '\'' +
                ", carPrice='" + raidPrice + '\'' +
                '}';
    }
}
