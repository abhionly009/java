package a15062026;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge( int [] a, int [] b) {
        for (int i =0;i<a.length;i++){

            if (a[i]>b[0]){
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                int firstPosition = b[0];
                int k;
                for (k=1;k<b.length && b[k]<firstPosition;k++){
                    b[k-1] = b[k];
                }
                b[k-1] = firstPosition;
            }


        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }


    public static void main(String[] args) {

        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};
        merge(a,b);

    }
}