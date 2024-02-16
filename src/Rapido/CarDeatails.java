package Rapido;

public class CarDeatails {
    private   String cartype;
    private   String raidPrice;


    public CarDeatails(){
        cartype = "BMW";
        raidPrice = "20000";
    }


    public CarDeatails(String cartype, String carPrice) {
        this.cartype = cartype;
        this.raidPrice = carPrice;
    }

    public String getCarPrice()
    {
        return raidPrice;
    }

    public String getCartype() {
        return cartype;
    }

    @Override
    public String toString() {
        return "CarDeatails{" +
                "cartype='" + cartype + '\'' +
                ", raidPrice='" + raidPrice + '\'' +
                '}';
    }
}
