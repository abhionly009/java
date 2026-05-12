package arraysExample;

import java.util.*;

public class MinAndMaxSumOfArray {

    public static void miniMaxSum(List<Integer> arr) {



        long totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);



        for (int num : arr) {
            totalSum += num;
            if (num < min)
            {
                min = num;
                System.out.println("min =="+min);
            }
            if (num > max) {
                max = num;
                System.out.println(" max ->"+max);
            }
        }
        System.out.println(totalSum);
        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);


        // Write your code here
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i=0;i<arr.size();i++){
//            int sum =0;
//            for (int j = 0; j<arr.size();j++){
//                if (Objects.equals(arr.get(i), arr.get(j))){
//                    continue;
//                }
//                sum = sum + arr.get(j);
//
//            }
//            list.add(sum);
//
//
//        }
//
//        Collections.sort(list);
//        int size = list.size();
//        System.out.println(list.get(0));
//        System.out.println(list.get(size-1));


    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);

        miniMaxSum(list);
    }
}
