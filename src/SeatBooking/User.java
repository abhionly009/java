package SeatBooking;

public class User implements Runnable{

    private final BookingService bookingService;
    private String name;
    private int seatsToBook;

    public User(BookingService bookingService, String name, int seatsToBook) {
        this.bookingService = bookingService;
        this.name = name;
        this.seatsToBook = seatsToBook;
    }




    @Override
    public void run() {

        bookingService.bookSeats(name,seatsToBook);
    }
}
