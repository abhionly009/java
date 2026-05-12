package Telstra;

import java.util.*;

public class ExceptionHandling {

    public static void before(){
        Set<String> set = new TreeSet();
        set.add("2");
        set.add("3");
        set.add("1");

        Iterator<String> it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }
    }

    public static void printStatement(){
//        char x = \u0055;
//        char y = 'u0037';
//        char z = "u0065";
    }


    public static void main(String[] args) {

        before();

    }
}
