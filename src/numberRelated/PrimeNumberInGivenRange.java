package numberRelated;

public class PrimeNumberInGivenRange {

    public static boolean isPrime (int input ){

        boolean isPrime = true;

        if (input<=1){
            isPrime = false;
        }
        for (int i = 2; i<=Math.sqrt(input);i++){
            if (input%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        int range = 50;

        for (int i =1; i<=range;i++){
            if (isPrime(i)){
                System.out.print( " " + i);
            }
        }

    }
}
