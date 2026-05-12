package aaaaaaaDSA.twopointer;

public class MoveZeroToEnd {

    public static void moveZero(int [] arr){
        int left = 0;

        int right = left+1;

        while (left<right){

            if (arr[left] == 0){
                arr[left] = arr[right];
            }
        }
    }




    public static void main(String[] args) {




    }
}
