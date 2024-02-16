package Rapido;

public class RapidoTest {
    public static void main(String[] args) {
        BookingProcess bookingProcess = new BookingProcess();
        CarDeatails carDeatails = new CarDeatails("suv","300");
        BookingDetails bookingDetails = new BookingDetails("EVauto","KTM",4,"uday",carDeatails);
        System.out.println( bookingProcess.rapidBooking(bookingDetails));
    }
}
