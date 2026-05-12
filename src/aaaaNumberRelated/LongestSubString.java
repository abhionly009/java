package aaaaNumberRelated;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {


        String str = "abcdeavdefrsb";

//        Map<Character,Integer> map = new HashMap<>();
        int [] seen = new int [255];
        Arrays.fill(seen,-1);
        int n = str.length();
        int l =0 ;
        int r = 0;
        int maxLen =0;

        while (r<n){

            if (seen[str.charAt(r)]!=-1){
                if(seen[str.charAt(r)]>=l){
                    l = seen[str.charAt(r)]+1;
                }
            }

            int len = r-l+1;
            maxLen = Integer.max(len,maxLen);
            seen[str.charAt(r)]= r;
            r++;
        }

        System.out.println(maxLen);

    }
}
