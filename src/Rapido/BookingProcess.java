package Rapido;

public class BookingProcess {
    public BookingDetails rapidoBooking(BookingDetails bookingDetails){

        if(bookingDetails.getNoOfPersons()==1){
            System.out.println("you sucessfully booked  " + bookingDetails.getBike());
        }
        if  (bookingDetails.getNoOfPersons() > 1 && bookingDetails.getNoOfPersons() <= 3) {
            System.out.println("you sucessfully booked  " + bookingDetails.getAuto());
        }
        if (bookingDetails.getNoOfPersons()>=3){
            System.out.println("you sucessfully booked  " + bookingDetails.getCarDeatails());
        }
            return bookingDetails;
    }
    public BookingDetails rapidBooking(BookingDetails bookingDetails,String name){
        if(bookingDetails.getNoOfPersons()<2){
            System.out.println("you sucessfully booked  " + bookingDetails.getBike());
        }
        if  (bookingDetails.getNoOfPersons() > 1 && bookingDetails.getNoOfPersons() <= 3) {
            System.out.println("you sucessfully booked  " + bookingDetails.getAuto());
        }
        if (bookingDetails.getNoOfPersons()>=4){
            System.out.println("you sucessfully booked  " + bookingDetails.getCarDeatails());
        }
        if(bookingDetails.getName().equals(name)){
            System.out.println( "your otp is 2475");
        }else {
            System.out.println("user name is in correct");
        }
        return  bookingDetails;
    }



}
