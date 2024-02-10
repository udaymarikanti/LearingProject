package Rapido;

public class BookingProcess {
    public BookingDetails rapidBooking(BookingDetails bookingDetails){

        if(bookingDetails.getNoOfPersons()<=1){
            System.out.println("you sucessfully bocked  " + bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons()<=3) {
            System.out.println("you sucessfully bocked  " + bookingDetails.getAuto());
        }else{
            System.out.println("you sucessfully bocked  " + bookingDetails.getCarDeatails());
        }
            return bookingDetails;
    }
    public BookingDetails rapidBooking(BookingDetails bookingDetails,String name){
        if(bookingDetails.getNoOfPersons()<=1){
            System.out.println("you sucessfully bocked  " + bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons()<=3) {
            System.out.println("you sucessfully bocked  " + bookingDetails.getAuto());
        }else{
            System.out.println("you sucessfully bocked  " + bookingDetails.getCarDeatails());
        }
        if(bookingDetails.getName().equals(name)){
            System.out.println( "your otp is 2475");
        }else {
            System.out.println("user name is in correct");
        }
        return  bookingDetails;
    }



}
