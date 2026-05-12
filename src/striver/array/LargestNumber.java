package striver.array;

/**
 * Given an array write code to return largest number from array.
 *  int [] arr = {2,4,1,2,5,3}
 *  output should be 5
 */
public class LargestNumber {


    public static int findLargest(int [] arr){

        int largest = arr[0];

        for (int i =1;i<arr.length;i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int [] input = {2,4,1,2,5,3};
      int largest =  findLargest(input);

        System.out.println(" Largest number in given array is " + largest);
    }
}
