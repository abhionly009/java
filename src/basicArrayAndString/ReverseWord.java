package basicArrayAndString;

public class ReverseWord {

    public static String reverseWord(String originalString){

        String [] arr = originalString.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(arr.length);
        for (int i = arr.length-1;i>=0;i--){
            stringBuilder.append(arr[i]+" ");

        }
        return new String(stringBuilder).trim();
    }

    public static void main(String[] args) {

        String input = "  Hello from java world  ";
        System.out.println("===============Original String================ ");
        System.out.println(input);
      String reversedString =  reverseWord(input);

        System.out.println(reversedString);

    }
}
