package basicArrayAndString;

public class FindMissingNumber {

    public static int findSum(int n)
    {

    return n * (n+1)/2;

    }

    public static int findActualSum(int []arr){

        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {

//        int [] arr = {1,2,4,5,6};

        int [] arr = {3,0,1};

        int expectedSum = findSum(arr.length);
        int actualSum = findActualSum(arr);
        System.out.println(expectedSum);
        System.out.println(actualSum);
        int missingNumber = (expectedSum-actualSum);
        System.out.println(missingNumber);




    }
}
