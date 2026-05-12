package aaaaNumberRelated;

/**
 * Check Prime Number
 * example 13 is prime because it is divisible by 1 or itself
 * example 14 is not prime number because it is divisible by 2 and 7
 */
public class PrimeNumber {

    public static boolean isPrime(int n){
        for (int i =2;i<n/2;i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean prime = isPrime(13);
        System.out.println(prime);
    }

}
