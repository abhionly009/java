package aaaaaStringRelated;

public class StringMethods {

    public static void main(String[] args) {


        String str = new String("Hello world");

       String [] arr =  str.split(" ");

       for(String data:arr){
           System.out.println(data);
       }

       String joinResult = str.join("-", "Abhinandan", "in");

//       String format = str.format("")

      boolean isMatched =  str.matches("Hello");

        System.out.println(joinResult);
        System.out.println(isMatched);
        System.out.println(str);

    }
}
