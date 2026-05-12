package striver.array;

public class RemoveDuplicateInSortedArray {

    public static void main(String[] args) {

        int [] arr = {1,1,2,2,2,3,3,4};

        int i = 0;
        for (int j=1;j<arr.length;j++){

            if (arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }

        }

        System.out.println("Total unique numbers in given list are " + (i+1));

    }
}
