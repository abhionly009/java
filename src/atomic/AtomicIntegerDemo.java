package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {



    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println(atomicInteger.get());

        atomicInteger.set(12);

        System.out.println(atomicInteger.get());

        atomicInteger.incrementAndGet();

        System.out.println(atomicInteger.get());

        int result =  atomicInteger.getAndIncrement();
        System.out.println(result +"  ------ ");

        System.out.println(atomicInteger.get());

        atomicInteger.decrementAndGet();

        System.out.println(atomicInteger.get());

        atomicInteger.getAndDecrement();

        System.out.println(atomicInteger.get());

        atomicInteger.addAndGet(10);

        System.out.println(atomicInteger.get());

        atomicInteger.getAndAdd(10);

        System.out.println(atomicInteger.get());

        atomicInteger.compareAndSet(33,190);

        System.out.println(atomicInteger.get());

        atomicInteger.compareAndExchange(32,190);

        System.out.println(atomicInteger.get());




    }
}
