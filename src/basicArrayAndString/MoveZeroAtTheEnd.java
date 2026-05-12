package basicArrayAndString;

public class MoveZeroAtTheEnd {

    public static void main(String[] args) {


//        int [] arr = {1,2,0,2,5,0,3};
        int [] arr = {0,0,1};

        int pointer = 0;
        for (int i=0;i<arr.length;i++){

            if (arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[pointer];
               arr[pointer] = temp;
               pointer++;
            }

        }

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
