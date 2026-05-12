package algorithm.sorting;

public class NormalSort {

    public static void main(String[] args) {

        int [] arr = {4,9,7,5,2,3};

        for (int j=0;j<arr.length-1;j++){

            for (int i=0;i<arr.length-1;i++){

                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        System.out.println("--------------------------");

        for(int i =0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }


    }

}
