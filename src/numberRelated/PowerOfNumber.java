package numberRelated;

public class PowerOfNumber {
    public static int pow(int base, int power)
    {


        int result = 1;

        for (int i =1;i<=power;i++){
            result = result* base;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(pow(2,0));

    }
}
