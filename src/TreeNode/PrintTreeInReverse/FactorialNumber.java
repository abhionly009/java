package TreeNode.PrintTreeInReverse;

public class FactorialNumber {

    public static int factorial(int number){

        if (number==0 || number == 1)
            return 1;

        int fact = 1;


        for (int i=number;i>0;i--){

            fact = i*fact;
//            System.out.println(fact);
        }

        return fact;

    }

    public static void main(String[] args) {
//        factorial(5);
        System.out.println(factorial(5));
    }
}
