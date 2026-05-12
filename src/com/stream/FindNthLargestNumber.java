package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindNthLargestNumber {

    public static void findNthLargestNumber(List<Integer> arr, int nth){


        Integer i = arr.stream().sorted(Comparator.reverseOrder())
                .skip(nth)
                .findFirst()
                .orElse(null);

        System.out.println(i);
    }


    public static void main(String[] args) {


        Integer [] arr = {1,1,1,1,1,1};

        List<Integer> input = new ArrayList<>(List.of(arr));

        findNthLargestNumber(input,3);

    }

}
