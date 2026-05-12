package SeatBooking;

public class BookSeatsMain {

    public static void main(String[] args) {

        BookingService bookingService = new BookingService();
        User user1 = new User(bookingService, "Abhinandan", 3);
        User user2 = new User(bookingService, "kunal", 2);

        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t1.start();
        t2.start();


    }
}
