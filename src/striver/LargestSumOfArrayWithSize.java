package striver;

public class LargestSumOfArrayWithSize {

    public static int findLargestSum(int [] arr, int size){

        int left = 0;
        int right = size;
        int sum = 0;




//        while (left<right){
//            sum = sum+arr[left];
//            left++;
//
//        }
int maxSum = sum;

        left = right;
        right = arr.length-1;
        while(left<right){
            sum = sum + arr[left];
            left++;
        }
maxSum = Math.max(maxSum,sum);
        System.out.println(maxSum);
        return 0;
    }


    public static void main(String[] args) {

        int [] arr = {1,7,3,4,5,9};

findLargestSum (arr,4);

    }
}
