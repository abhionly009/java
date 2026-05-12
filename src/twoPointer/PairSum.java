package twoPointer;

// deign a method such that, it will produce number of pairs available in sorted array which sum results to k
public class PairSum {

    public static void checkPair(int [] arr, int target){

        int count = 0;
        int left = 0;
        int right = arr.length-1;

        while(left<right){
             int sum = arr[left]+arr[right];

             if (arr[left]+arr[left+1]>target){
                 System.out.println("No such pair in the input whose result will be " + target + " because target is smaller number");
                 break;
             }
             if (arr[right]+ arr[right-1]<target){
                 System.out.println("No such pair in the input whose result will be " + target + " because target is larger number");
                 break;
             }

            if (sum == target){
                count++;

                System.out.println("{ "+arr[left] +"  " + arr[right] + " } " +" will form a pair whose total will be " + target);
                left++;
                right--;
            }else if (sum>target){
                right--;
            }else {
                left++;
            }

        }

        System.err.println("Total number of such pairs " +count);


    }

    public static void main(String[] args) {
        int [] input = {1,3,4,5,6,7,8,9};
        checkPair(input, 21);
    }
}
