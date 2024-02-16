package Rapido;

public class CarDeatails {
    private   String cartype;
    private   String ridePrice;


    public CarDeatails(){
        cartype = "BMW";
        ridePrice = "20000";
    }


    public CarDeatails(String cartype, String ridePrice) {
        this.cartype = cartype;
        this.ridePrice = ridePrice;
    }

    public String getCarPrice()
    {
        return ridePrice;
    }

    public String getCartype() {
        return cartype;
    }

    @Override
    public String toString() {
        return "CarDeatails{" +
                "cartype='" + cartype + '\'' +
                ", ridePrice='" + ridePrice + '\'' +
                '}';
    }
}
