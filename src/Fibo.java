public class Fibo {

    public static void fibonacciSeries(int terms){

        int num1 = 0;
        int num2 = 1;
        for (int i=0;i<terms;i++){
            System.out.print(num1+ " ");
            int num3 = num1+  num2;
            num1 = num2;
            num2 = num3;
        }
    }


    public static void main(String[] args) {

        fibonacciSeries(10);

    }
}
