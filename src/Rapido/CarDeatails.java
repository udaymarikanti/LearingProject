package Rapido;

import RapidoRegistation.RapidoRegistationDetails;

public class CarDeatails extends RapidoRegistationDetails {
    private   String cartype;
    private   String ridePrice;


//    public CarDeatails(){
//
//        cartype = "BMW";
//        ridePrice = "20000";
//    }


    public CarDeatails(String name,String password,String mobileNo,String VechileType) {
        super(name,password,mobileNo,VechileType);

    }
//    public CarDeatails(String cartype, String ridePrice){
//        super();
//        this.cartype = cartype;
//        this.ridePrice = ridePrice;
//    }

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
