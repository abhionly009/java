package numberRelated;

public class ReverseANumber {

    public static int reverseNumber(int input){
        System.out.println(input);
        int result = 0;
        while (input>0){
           int rem = input%10;
            result = result *10 + rem;
            input = input/10;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(reverseNumber(10834));
    }
}
