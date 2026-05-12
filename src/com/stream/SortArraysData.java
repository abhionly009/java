package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortArraysData {

    public static void sortedArrayUsingStream(int []arr){

        IntStream sorted = Arrays.stream(arr).sorted();

        sorted.forEach(System.out::print);

    }


    public static void sortArrayUsingStreamInReverse(Integer [] arr){

       Integer[] intStream =  Arrays.stream(arr).
               sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(intStream));
    }
    public static void main(String[] args) {
        Integer [] arr = {4,1,5,7,6,3,2};

        int [] input = {4,1,5,7,6,3,2};
        sortedArrayUsingStream(input);
        System.out.println();
        sortArrayUsingStreamInReverse(arr);
    }
}
