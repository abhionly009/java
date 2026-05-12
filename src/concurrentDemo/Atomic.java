package concurrentDemo;

import threadsDemo.MyThread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger();
      int data =  atomicInteger.addAndGet(12);
        System.out.println(data);

    }

    MyThread myThread = new MyThread();

}
