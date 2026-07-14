package atomic;

import java.util.concurrent.atomic.AtomicReference;

public class SeatBooking {

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    public boolean bookSeat(String name){
        String currentValue  = seat.get();

        if (currentValue.equals("EMPTY")==false){
            return false;
        }
        return seat.compareAndSet(currentValue,name);

    }
}
