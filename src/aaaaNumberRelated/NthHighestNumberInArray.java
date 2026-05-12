package aaaaNumberRelated;

import java.util.Arrays;

public class NthHighestNumberInArray {

    public static void findNthHighest(int [] arr, int nth ){

        if (nth>arr.length)
            throw new RuntimeException(nth +" can not be found because it out of array size");

        Arrays.sort(arr);
        System.out.println(arr[arr.length - nth]);

    }

    public static void main(String[] args) {

        int [] arr = {12,14,15,32,22,5};
        findNthHighest(arr,4);

    }
}
