package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    AtomicInteger count = new AtomicInteger(0);

    public Integer increment(){

        return count.incrementAndGet();
    }
}
