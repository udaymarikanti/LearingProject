package Rapido;

public class BookingDetails extends  CarDeatails {

    private   String auto;
    private   String bike;
    private   int noOfPersons;
    private   CarDeatails carDeatails;
    private   String userName;
    private  String password;


    public BookingDetails(String auto, String bike, int noOfPersons,  String userName,String password,CarDeatails carDeatails) {
        super(carDeatails.getCartype(), carDeatails.getCarPrice());
        this.auto = auto;
        this.bike = bike;
        this.carDeatails = carDeatails;
        this.noOfPersons = noOfPersons;
        this.userName= userName;
        this.password = password;
    }
   public BookingDetails(String auto, String bike, int noOfPersons,String userName,String password) {
        this(auto,bike,noOfPersons,userName,password,new CarDeatails());
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
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
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
