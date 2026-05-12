package striver.array;


/**
 * Given an array you need to return 2nd highest number from considering non-negative numbers
 *  input [] = {1,3,5,2,4,7,7} , output 5
 *  input [] = {2,3,3,3,3,3} , output 2
 *  input [] = {-3,1,-2,-1}, output -1
 *
 */
public class SecondHighestNumber {


    public static int findSecondHighest(int [] arr){

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

//        int input [] = {1,3,5,2,4,7,7}
       int  [] input = {2,3,3,3,3,3}; // output 2
//        int [] input = {-3,1,-2,-1};
        int second = findSecondHighest(input);

        System.out.println(second);

    }
}
