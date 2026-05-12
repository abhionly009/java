package aaaaaaaDSA.twopointer;

public class TwoSum {

    public static void findTwoSum(int [] arr, int target ){

        int left = 0;
        int right = arr.length-1;
        boolean isFound = false;

        while (left<right){
            if (arr[left]+arr[right] == target){
                System.out.println("Item at "+  "index " + left +" which is "   +arr[left] + " and " + "at index " + right  +" which is " + arr[right] +" will sum up and return target " + " == " + target);
                break;
            }else if (arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }


    }


    public static void main(String[] args) {

        int [] arr = {12,34,5,9,3,10};

        findTwoSum(arr,15);

    }
}
