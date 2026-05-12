package aaaaaaaDSA.slidingWindow;

/**
 * Given an array find the max sum of size k and return the max sum
 */
public class FindMaxSumOfSizeK {

    public  int findMaxSum(int [] input, int size){

        if(input == null){
            throw new IllegalArgumentException("Array must not be Null");
        }
        if (input.length == 0 ){
            throw new IllegalArgumentException("Array must not be empty");
        }
        if (size>input.length){
           throw new IllegalArgumentException("Window size cannot exceed array length");
        }
        if (size<1){
            throw new IllegalArgumentException(" Window size must be at least 1 ");
        }


        int windowSum = 0;

        for (int i=0;i<size;i++){
            windowSum += input[i];
        }

        int maxSum = windowSum;

        for (int i =size;i<input.length;i++){

            windowSum += input[i] - input[i-size];

            maxSum = Math.max(windowSum,maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int [] input = {2,4,7,1,9,3,6};
        int size = 3;
        FindMaxSumOfSizeK findMaxSumOfSizeK = new FindMaxSumOfSizeK();
       int maxSum =  findMaxSumOfSizeK.findMaxSum(input,size);

        System.out.println("Maximum sum of " + size +" size sub-array is " +maxSum);



    }

}
