package Rapido;

public class RapidoTest {
    public static void main(String[] args) {
        BookingProcess bookingProcess = new BookingProcess();
        CarDeatails carDeatails = new CarDeatails("suv","300");
        BookingDetails bookingDetails = new BookingDetails("EvAuto","KTM",5,"uday","2222");
         bookingProcess.rapidoBooking(bookingDetails);
    }
}
