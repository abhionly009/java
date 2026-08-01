package java17;

public class PatternMatching {

    public static void main(String[] args) {


        Object obj = "Abhinandan";
        /**
         * Traditional matching
         * it requires explicit casting
         */

        if ( obj instanceof String){
            String str =(String) obj;
            System.out.println(str.length());

        }

        /**
         *   java 17 way of pattern Matching
         *   does not require explicit casting
         */

        if (obj instanceof String str){

            System.out.println(str.length());
        }

    }
}
