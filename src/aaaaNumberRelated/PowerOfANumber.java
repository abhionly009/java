package aaaaNumberRelated;

/**
 * Power of a Number
 * x^n using fast exponentiation
 */
public class PowerOfANumber {

    public static int powerOf(int num , int pow){

//      return   Math.pow(num,pow);
           int result = 1;
           for (int i =0;i<pow;i++){
                result = result * num;
           }
           return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf(3,4));
    }
}
