package aaaaNumberRelated;

/**
 * Perfect Number
 * Example: 28 → sum of divisors = 28
 * explain
 *      28's divisor are 1,2,4,7,14 == 1+2+4+7+17 = 28
 *      6's divisor are 1,2,3 == 1+2+3 = 6
 */
public class PerfectNumber {

    public static boolean isPerfect(int n){
        int sum = 1;
        for (int i =2;i<=n/2;i++){
            if (n%i==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        return n == sum;

    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }

}
