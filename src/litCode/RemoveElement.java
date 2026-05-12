package litCode;

public class RemoveElement {

    public static int remove(int []arr, int val){
        int count =0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
            }
        }

        return arr.length - count;


    }

    public static void main(String[] args) {
        int [] input  = {3,2,2,3};

        int count = remove(input, 1);

        System.out.println(count);


    }
}
