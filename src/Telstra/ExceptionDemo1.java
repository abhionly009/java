package Telstra;

import java.io.IOException;
import java.util.Arrays;

public class ExceptionDemo1 {


    public static void main(String[] args) {
        try{
            int [] a  = new int[1];
            a[2]= 40;
            a[2] =50;

        }catch (ArithmeticException e){
            System.out.println("E1");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("e2");
        }
        System.out.println("rest");

        for (int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
