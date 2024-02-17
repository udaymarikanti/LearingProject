package Rapido;

public class BookingProcess {

    public  Boolean login(BookingDetails bookingDetails){
        String localPassword = "2222";
        if(bookingDetails.getPassword()==localPassword){

            System.out.println( "your otp is 2475");
            return true;
        }else {
            System.out.println("password is not correct");
        }
        return false;
    }
    public BookingDetails rapidoBooking(BookingDetails bookingDetails) {
        if(login(bookingDetails)){
            if (bookingDetails.getNoOfPersons() == 1) {
                System.out.println("you sucessfully booked  " + bookingDetails.getBike());
            }
            if (bookingDetails.getNoOfPersons() > 1 && bookingDetails.getNoOfPersons() <= 3) {
                System.out.println("you sucessfully booked  " + bookingDetails.getAuto());

            }
            if (bookingDetails.getNoOfPersons() >= 3) {
                System.out.println("you sucessfully booked  " + bookingDetails.getCarDeatails());
            }
        }
        return bookingDetails;
    }
//    public BookingDetails rapidoBooking(BookingDetails bookingDetails,String name){
//        if(bookingDetails.getNoOfPersons()<2){
//            System.out.println("you sucessfully booked  " + bookingDetails.getBike());
//        }
//        if  (bookingDetails.getNoOfPersons() > 1 && bookingDetails.getNoOfPersons() <= 3) {
//            System.out.println("you sucessfully booked  " + bookingDetails.getAuto());
//        }
//        if (bookingDetails.getNoOfPersons()>=4){
//            System.out.println("you sucessfully booked  " + bookingDetails.getCarDeatails());
//        }
//
//        return  bookingDetails;
//    }



}
