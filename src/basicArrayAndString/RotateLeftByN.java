package basicArrayAndString;

public class RotateLeftByN {

    public static void rotate(int []arr, int n){
        n = n% arr.length;
        int []temp = new int[n];

        // form temp array
        for (int i =0;i<n;i++){
            temp[i] = arr[i];
        }

        // shift array element to previous position
        for (int j =0;j<n;j++){
            for (int i=1;i<arr.length;i++){
                arr[i-1] = arr[i];
            }
        }

        // add temp to left
        for (int i =0;i<temp.length;i++){

            arr[arr.length - temp.length +i] = temp[i];

        }
        // print rotated array
        for (int i =0;i<arr.length;i++){
            System.out.print( arr[i]);
        }

    }

    public static void main(String[] args) {

        int [] input = {1,4,5,2,9};

        rotate(input,6);

    }

}
