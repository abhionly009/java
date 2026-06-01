package numberRelated;

public class ArmstrongNumber {
    public static boolean isArmStrong(int input){

        int original = input;

        int sum =0;

        while (input>0){
           int rem = input%10;
            sum = sum + (rem*rem*rem);
            input = input/10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        System.out.println(isArmStrong(153));

    }
}
