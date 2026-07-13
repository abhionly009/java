package synechron;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {


    private AtomicInteger id = new AtomicInteger();

    public int getId() {
        return id.incrementAndGet();
    }
}
