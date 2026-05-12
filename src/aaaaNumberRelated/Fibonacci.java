package aaaaNumberRelated;

public class Fibonacci {

    public static void printFibonacci(int range){
        int first = 0;
        int second = 1;
        System.out.print ( first + " ," +second );


        for (int i =0;i<=range;i++){
//            System.out.print(  "," + (first+second) );

           int curr = first +second;
           first =second;
           second = curr;
            System.out.print( ", "+ curr);

        }
    }


    public static void main(String[] args) {

        int range = 9;

        printFibonacci(range);
    }
}
