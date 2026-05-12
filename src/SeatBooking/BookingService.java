package SeatBooking;

public class BookingService {

    private int availableSeats = 4;

    public synchronized void bookSeats(String user, int seatRequested){

        System.out.println(user + " trying to book " + seatRequested + " seats...");
        System.out.println(Thread.currentThread().getName());
        if (seatRequested<=availableSeats){
            availableSeats -= seatRequested;
            System.out.println(user + " booking successful!");

        }else {
            System.out.println("Not enough seats for " + user + ". Booking failed!");

        }

        System.out.println("Seats left: " + availableSeats);
        System.out.println("--------------------------------");
    }

}
