package aaaaaStringRelated;

public class ContainMethod {

    public static boolean contain(String input, String lookingFor){

        int n = input.length();
        int m = lookingFor.length();

        if (input.isEmpty())
            return false;
        if (lookingFor.isEmpty())
            return true;

        if (n<m)
            return false;

        for (int i =0;i<=n-m;i++){
            int j =0;

            while(j < m && input.charAt(i + j) == lookingFor.charAt(j)){
                j++;
            }

            if(j==m){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        String input = "hello world";
        String lookingFor = " ";

        System.out.println( contain(input,lookingFor));

    }
}
