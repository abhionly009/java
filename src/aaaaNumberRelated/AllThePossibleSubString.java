package aaaaNumberRelated;

public class AllThePossibleSubString {

    public static void main(String[] args) {


        String str = "abcdeavdefrsb";

        int maxLen = 0;
        int n = str.length();

        for (int i=0;i<n;i++){

                StringBuilder sb = new StringBuilder();
                int [] seen = new int[255];

                for (int j =i;j<n;j++){
                    if (seen[str.charAt(j)]==1){
                        break;
                    }
                    int len = j-i+1;
                    maxLen = Integer.max(len,maxLen);
                    sb.append(str.charAt(j));
                    seen[str.charAt(j)] = 1;
                    System.out.println(sb);
                }
        }
        System.out.println(maxLen);
    }
}
