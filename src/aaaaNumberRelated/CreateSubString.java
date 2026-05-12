package aaaaNumberRelated;


public class CreateSubString {
    public static void main(String[] args) {


        String str = "abcdeavdefrsb";
        int n = str.length();

        int maxLen = 0;


        for (int i=0;i<n;i++)
        {
            int [] seen = new int[255];

            StringBuilder sb = new StringBuilder();
            for (int j = i;j<n;j++){
                if (seen[str.charAt(j)] == 1){
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
