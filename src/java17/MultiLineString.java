package java17;

public class MultiLineString {

    public static void main(String[] args) {

        /**
         * Before java 17
         */

        String str = "I am working hard to get it done \n" +
                " This shows my perseverance ";

        System.out.println(str);

        /**
         *   Java 17 way
         *
         */

        String message = """
                 I am working hard to get it done 
                 This shows my perseverance
                """;

        System.out.println(message);



    }
}
