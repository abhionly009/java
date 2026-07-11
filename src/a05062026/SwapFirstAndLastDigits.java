package a05062026;

public class SwapFirstAndLastDigits {

    public static int swapFirstLast(int num) {

        if (num < 10)
            return num;

        int last = num % 10;

        int first = num;
        int digits = 0;

        while (first >= 10) {
            first /= 10;
            digits++;
        }

        int power = (int) Math.pow(10, digits);

        // Remove first and last digit
        int middle = (num % power) / 10;

        // Construct new number
        return last * power + middle * 10 + first;
    }

    public static void main(String[] args) {

        System.out.println(swapFirstLast(12345));  // 52341
        System.out.println(swapFirstLast(987654)); // 487659
        System.out.println(swapFirstLast(5));      // 5

    }
}
