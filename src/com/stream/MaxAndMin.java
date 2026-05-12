package com.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxAndMin {

    public static void findMaxElement(int [] arr){


       OptionalInt max =  Arrays.stream(arr).max();

        System.out.println("Max " + max.getAsInt());
    }

    public static void findMin(int [] arr){
    OptionalInt min =    Arrays.stream(arr).min();

        System.out.println("Min "+min.getAsInt());

        StringBuilder sg = new StringBuilder();

    }

    public static void main(String[] args) {

        int [] arr = {-2,-100,1,4,6,7,5,3,6,8,4,7,23};
        findMaxElement(arr);


        findMin(arr);

    }
}
