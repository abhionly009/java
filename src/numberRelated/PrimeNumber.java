package numberRelated;

public class PrimeNumber {

    public static boolean isPrime(int input){
        boolean isPrime = true;

        if (input<=1){
            isPrime = false;
        }

        for (int i =2;i<= Math.sqrt(input);i++){

            if (input%i ==0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int input = 12;
        System.out.println("Given number " + input +  " is prime ? " + isPrime(input));
    }
}
