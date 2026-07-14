package atomic;

public class SeatBookingUsingAtomicReferenceMain {


    public static void main(String[] args) {
        SeatBooking seatBooking = new SeatBooking();

        Runnable r1 = ()->{
           boolean result = seatBooking.bookSeat("Abhinandan");

            System.out.println("T1 says seat is booked " + result );
        };


        Runnable r2 = ()->{
            boolean result = seatBooking.bookSeat("Harshit");
            System.out.println("T2 says seat is booked " + result );

        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
