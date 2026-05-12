package Strings;

public class StringAndStringBuffer {

    public static void main(String[] args) {

        String str = "Hello";

        str.concat("World");




        StringBuffer stringBuffer = new StringBuffer("Hello");


        System.out.println(str==stringBuffer.toString());

//       String drt =  str.concat(" World");


//        System.out.println(drt);

//        System.out.println(str);


//        StringBuffer stringBuffer = new StringBuffer("Hello");
//        stringBuffer.append(" World");
//
//        System.out.println(stringBuffer);
    }

}
