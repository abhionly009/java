package TwoPointerBased;

import java.util.ArrayList;
import java.util.List;

public class AllThePossiblePairs {

    public static List<int[]> findPair(int [] arr, int target){

        int left = 0;
        int right = arr.length-1;

        List<int[]> results = new ArrayList<>();


        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum==target){
                results.add( new int[]{arr[left],arr[right]});

                int leftVal = arr[left];
                int rightVal = arr[right];


                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;
            } else if (sum<target){
                left++;
            }else {
                right--;
            }
        }

        return  results;
    }

    public static void main(String[] args) {

        int [] arr = {5,7,10,11,15,19,25};

        List<int[]> pairs = findPair(arr,26);

        for(int[]p :pairs){
            System.out.println(p[0] + " , " +p[1] +" will add up to target 26 ");
        }

    }
}
