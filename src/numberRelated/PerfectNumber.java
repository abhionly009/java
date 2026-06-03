package numberRelated;

public class PerfectNumber {

    public static boolean isPerfectNumber(int input){
        int sum = 0;

        for (int i =1;i<input;i++){
            if (input%i ==0){

                sum +=i;
            }
        }

        return input == sum;
    }

    public static void main(String[] args) {
        int input = 6;
        System.out.println(input + " is perfect number ? " + isPerfectNumber(input) );
    }
}
