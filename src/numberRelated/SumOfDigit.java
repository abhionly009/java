package numberRelated;

public class SumOfDigit {

    public static  int totalSum(int input){

        int sum =0;
        while (input>0){
            int rem = input%10;
            sum = sum+rem;
            input = input/10;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Digit sum of given input " + totalSum(42189342));

    }
}
