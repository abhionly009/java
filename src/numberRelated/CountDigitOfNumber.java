package numberRelated;

public class CountDigitOfNumber {

    public static int count(int input){
        int count = 0;
        while (input>0){
             input = input/10;
            count++;

        }
        return count;

    }

    public static void main(String[] args) {

        System.out.println("Total number of digits in given input are " + count(1234));
    }
}
