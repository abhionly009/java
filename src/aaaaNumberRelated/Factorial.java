package aaaaNumberRelated;

/**
 * Factorial of a Number
 * This is iterative approach
 */

public class Factorial {

    public static int findFactorial(int n){
        int factorial = 1;

        for (int i=n;i>0;i--){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

}
