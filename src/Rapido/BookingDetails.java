package Rapido;

public class BookingDetails extends  CarDeatails {
    private  String name;

    private   String auto;
    private   String bike;

    private   int noOfPersons;
    private   CarDeatails carDeatails;




    public BookingDetails(String auto, String bike, int noOfPersons,String name,CarDeatails carDeatails) {
        super(carDeatails.getCartype(), carDeatails.getCarPrice());
        this.auto = auto;
        this.bike = bike;
        this.carDeatails = carDeatails;
        this.noOfPersons = noOfPersons;
        this.name = name;
    }
    public BookingDetails(String auto, String bike, int noOfPersons,String name) {
        this(auto,bike,noOfPersons,name,new CarDeatails());
    }

    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public CarDeatails getCarDeatails() {
        return carDeatails;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", carDeatails=" + carDeatails +
                ", noOfPersons=" + noOfPersons +
                '}';
    }
}
