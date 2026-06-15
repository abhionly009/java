package a15062026;

import java.util.Arrays;

public class MergeTwoSortedArrayInOne {

    /**
     *
     * @param a : an array with n size
     * @param b : an array with size m
     */
    public static void merge(int [] a, int [] b){

        int [] result = new int [a.length+b.length];

        int i =0 ,j=0, k =0;

        while (i<a.length && j<b.length){

            if (a[i]<=b[j]){

                result[k++] = a[i++];

            }else {
                result [k++] =b[j++];
            }

        }

        while (i<a.length){
            result[k++] = a[i++];
        }

        while(j<b.length){
            result[k++] = b[j++];
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int [] a = {2,4,7,10};
        int [] b = {2,3};

        merge(a,b);
    }
}
