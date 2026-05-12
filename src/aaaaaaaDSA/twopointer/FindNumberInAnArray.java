package aaaaaaaDSA.twopointer;

public class FindNumberInAnArray {

    public static int findIndex(int [] arr, int target)
    {
        int left = 0;
        int right = arr.length-1;
        int result = -1;

        while (left<right){

            if (arr[left]!=target && arr[left]<=target){
                left++;
            } if (arr[right]!=target && arr[right]>target){
                right--;
            } if (arr[right] == target ) {
                return right;
            } if (arr[left] == target){
                return left;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] arr = {10,30,53,59,60,75,79,90};
        int result = findIndex(arr,10);
        System.out.println(result);


    }
}
