package a05062026;

import java.util.HashSet;
import java.util.Set;

public class AllDigitsAreUnique {
    public static boolean hasUniqueDigits(int num) {

        num = Math.abs(num);

        Set<Integer> set = new HashSet<>();

        while (num > 0) {

            int digit = num % 10;

            if (set.contains(digit)) {
                return false;
            }

            set.add(digit);
            num /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(hasUniqueDigits(12345)); // true
        System.out.println(hasUniqueDigits(11234)); // false
    }
}
