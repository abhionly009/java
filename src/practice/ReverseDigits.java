package practice;

public class ReverseDigits {

    public static int reverseDigit(int input){
        int reversed = 0;
        int reminder = 1;

        while (input>0){

            reminder = input%10;
            reversed = reminder + reversed * 10;

            input = input/10;

        }


        return reversed;
    }

    public static void main(String[] args) {


        int rev = reverseDigit(1249);

        System.out.println(rev);
    }
}
