package a05062026;

public class AddTwoNumbersWithoutPlusOperator {

    public static int add(int a, int b) {

        while (b != 0) {

            int sum = a ^ b;          // Sum without carry
            int carry = (a & b) << 1; // Carry

            a = sum;
            b = carry;
        }

        return a;
    }


    public static void main(String[] args) {

        System.out.println(add(5, 3));    // 8
        System.out.println(add(10, 15));  // 25
        System.out.println(add(-5, 8));


    }
}
