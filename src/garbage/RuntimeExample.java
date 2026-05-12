package garbage;

import copy.User;

import java.util.Date;

public class RuntimeExample {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        long totalMemory = r.totalMemory();

        System.out.println("Before total  "+r.totalMemory());

        System.out.println("Before free "+ r.freeMemory());

        for (int i=0;i<10000;i++){
           Date date= new Date();
           date = null;
        }

        System.out.println("After free memory " + r.freeMemory());

        r.gc();
        System.out.println("After running gc "+ r.freeMemory());




    }
}
