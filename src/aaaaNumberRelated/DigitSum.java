package aaaaNumberRelated;

/**
 * Sum of Digits
 * Input: 123 → Output: 6
 */
public class DigitSum {
    public static int findSum(int n){

        int rem, sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int input = 245;
       int sum = findSum(input);
        System.out.println("digit sum of given number " + input +" is "+ sum);
    }
}
