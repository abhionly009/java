package ThreadGroupDemo;

import java.util.Arrays;
import java.util.List;

public class ThreadGroupMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());

        Thread t = new Thread("Hello");

//        System.out.println(t.getThreadGroup().getName());

        ThreadGroup g1 = new ThreadGroup("First group");



        Thread t1 = new Thread(g1,"Thread 1");

        g1.setMaxPriority(3);

        Thread t2 = new Thread(g1,"Thread 2");

            t2.setPriority(8);

//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());


        System.out.println(g1.activeGroupCount());

//        g1.list();

    }
}
