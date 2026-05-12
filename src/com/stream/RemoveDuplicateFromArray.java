package com.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicateFromArray {

    public static void findDistinct(int [] arr){
        IntStream distinct = Arrays.stream(arr).distinct();
        distinct.forEach(System.out::print);

    }

    public static void findDistinctAndSort(int [] arr){
        IntStream distinct = Arrays.stream(arr).sorted().distinct();

        distinct.forEach(System.out::print);

    }


    public static void main(String[] args) {

        int [] arr =  {1,3,5,6,2,4,2,1,4,5,6,9};

        findDistinct(arr);
        System.out.println();
        findDistinctAndSort(arr);

    }
}
