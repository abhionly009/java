package day23;

public class TwoSum {

    public int[] findIndexOfTwoNumbers(int [] arr, int target){
        int left =0;
        int right = arr.length-1;

        int [] result = {-1,-1};
        while (left<right){
            if (arr[left]+ arr[right]==target){
                result[0] = left;
                result[1] =right;
                break;
            }

            if (arr[left]+arr[right]>target){
                right--;
            }
            if (arr[left]+arr[right]<target){
                left++;
            }


        }

        return result;
    }

    public static void main(String[] args) {


        int [] input = {2,7,11,15};

        int target = 9;

        TwoSum twoSum = new TwoSum();
       int [] result = twoSum.findIndexOfTwoNumbers(input,target);

        System.out.println(result[0]+" " +  result[1]);
    }
}
