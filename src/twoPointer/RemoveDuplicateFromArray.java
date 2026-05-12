package twoPointer;

public class RemoveDuplicateFromArray {

    public static void remove(int [] arr){

     int j=0;

     for (int i=1;i<arr.length;i++){
         if (arr[j]==arr[i]){
            arr[i] = -1;
             System.out.println(arr[j]  + " is duplicate " );
         }
         j++;
     }


        System.out.println("------------------");


     for (int num : arr){
         System.out.print(num  + " ");
     }


    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,7,7,9,9};
        remove(arr);
    }
}
