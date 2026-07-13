package synechron;


import java.util.concurrent.atomic.AtomicLong;

public class IdProviderImpl implements IdProvider{

static AtomicLong atomicLong =  new AtomicLong(0);

    @Override
    public long getId() {


      return atomicLong.getAndIncrement();


    }
}
