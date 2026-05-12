import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {

    //String s = "Java is Object Oriented "
//avaj si tcejbo detneirO

    public static void printReverse(String str){

        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
    }

    public static void reverseS(String str){

        String [] arr = str.split(" ");

        for (int i=0;i<arr.length;i++){
            printReverse(arr[i]);
        }

    }

    public static void main(String[] args) {
        String s = "Java is Object Oriented ";
        reverseS(s);

    }
}
