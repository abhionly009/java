package TwoPointerBased;

public class MergeTwoSortedArray {

    public static int [] merge(int [] arr1, int [] arr2){

        int i = 0;
        int j = 0;
        int k = 0;


        int [] result = new int [arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){

            if (arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }


        }

        while (i<arr1.length){
            result[k++] = arr1[i++];
        }

        while(j<arr2.length){
            result[k++] = arr2[j++];
        }

        return result;
    }




    public static void main(String[] args) {

        int [] a = {1,5,6,8,9};
        int [] b = {2,4,5,10};

        int [] result = merge(a,b);

        for (int n : result){
            System.out.print(" "+n + " ");
        }

    }
}
