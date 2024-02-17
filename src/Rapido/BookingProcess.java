package Rapido;

public class BookingProcess {


    public  Boolean login(BookingDetails bookingDetails){
        if(bookingDetails.getName().equals(bookingDetails.getUserName())){
            System.out.println( "your otp is 2475");
            return true;
        }else {
            System.out.println("user name is in correct");
        }
        return false;
    }
    public BookingDetails rapidoBooking(BookingDetails bookingDetails) {


        if (this.login(bookingDetails)) {

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
