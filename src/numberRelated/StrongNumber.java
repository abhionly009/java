package numberRelated;

public class StrongNumber {

    public static boolean isStrongNumber(int input){

        int original = input;
        int sum = 0;

        while (input>0){

            int rem = input%10;
            int fact = 1;

            for (int i =1;i<=rem;i++){
                fact *=i;
            }

            sum += fact;
            input/=10;

        }

        return sum == original;
    }

    public static void main(String[] args) {

        System.out.println(isStrongNumber(146));
    }
}
