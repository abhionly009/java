package numberRelated;

public class EvenOrOdd {

    public static boolean isEven(int input){

        if ((input &1) ==0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int input =13;
        System.out.println(input +" is even ? " + isEven(input));
    }
}
