package aOperationOnyourName;

public class ChangeCase {

    public String toUpperCase(String name){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i =0;i<name.length();i++){
            char ch = name.toLowerCase().charAt(i);
            if (ch>='a' && ch<='z'){
                int i1 = ch - 32;
                stringBuilder.append((char) i1);
            }
        }

        return stringBuilder.toString();
    }


    public String toLowerCase(String name){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i =0;i<name.length();i++){
            char ch = name.toUpperCase().charAt(i);
            if (ch>='A' && ch<='Z'){
                int i1 = ch + 32;
                stringBuilder.append((char) i1);
            }
        }

        return stringBuilder.toString();
    }



    public static void main(String[] args) {

        ChangeCase changeCase = new ChangeCase();
        String s  = changeCase.toLowerCase("ABHINANDAN");
        String b  = changeCase.toUpperCase("Abhinandan");

        System.out.println(s);
        System.out.println(b);

    }
}
