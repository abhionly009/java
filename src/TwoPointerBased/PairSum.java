package TwoPointerBased;

public class PairSum {


    public static void findPair(int [] arr, int target){

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum==target){
                System.out.println(arr[left] + " + " + arr[right] + " == " + target );
                break;
            } else if (sum<target){
                left++;
            }else {
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {5,7,10,11,15,19,25};

        findPair(arr,26);

    }
}
