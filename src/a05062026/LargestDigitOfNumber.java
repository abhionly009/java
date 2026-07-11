package a05062026;

public class LargestDigitOfNumber {

    public static int findLargestDigit(int num) {

        num = Math.abs(num); // Handles negative numbers

        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            num /= 10;
        }

        return largest;
    }


    public static void main(String[] args) {

        System.out.println(findLargestDigit(192));
        System.out.println(findLargestDigit(981297));
        System.out.println(findLargestDigit(-137));

    }
}
