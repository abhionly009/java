import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter size of array");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] array  = new int[input];
        System.out.println("Enter array elements");

        for (int i =0; i<input;i++){
            array[i] = sc.nextInt();
        }

        String s = new String("Hello");


        System.out.println("Printing array elements...");
        System.out.print(" [ ");

        for (int j : array) {
            System.out.print(j + ", ");

        }
        System.out.print(" ] ");

    }
}