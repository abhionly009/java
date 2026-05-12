package aaaaNumberRelated;

public class MissingNumber {

    public static int expectedSum(int num){
        return  num * (num+1)/2;
    }

    public static int actualSum (int [] arr){
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }



    public static void main(String[] args) {
//        int [] arr = {1,2,3,5};
        int [] arr = {0,2,3};
//        int [] arr = {2,0,1};

        int expectedSum = expectedSum(arr.length);
        int actualSum = actualSum(arr);

        System.out.println(expectedSum + " " + actualSum);
        System.out.println(expectedSum-actualSum);

    }
}
