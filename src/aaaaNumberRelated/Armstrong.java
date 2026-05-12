package aaaaNumberRelated;

/**
 * Armstrong Number
 * Example: 153 = 1³ + 5³ + 3³
 */
public class Armstrong {

    public static int qube(int n ){
        return n*n*n;
    }

    public static boolean isArmstrong(int n){

        int original = n;
        int sum = 0;

        while (n>0)
        {
           int rem = n%10;
            sum = sum + qube(rem);
            n = n /10;
        }
        return original == sum;
    }


    public static void main(String[] args) {
        int input = 370;
        System.out.println("The given number is armstrong --> " + isArmstrong(input));
    }
}
