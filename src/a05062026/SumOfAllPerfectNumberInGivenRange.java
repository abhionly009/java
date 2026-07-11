package a05062026;

public class SumOfAllPerfectNumberInGivenRange {


    public static boolean isSelfDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0 || num % digit != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSelfDividing(432));
        System.out.println(isSelfDividing(431));


    }
}
