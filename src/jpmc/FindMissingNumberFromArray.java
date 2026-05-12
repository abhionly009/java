package jpmc;

public class FindMissingNumberFromArray {


    public static int findMissing(int [] arr){
        int n = arr.length+1;

        int  []hash  = new int [n+1];

        for(int i=0;i<n-1;i++){

            hash[arr[i]]++;
        }



        for (int i = 1;i<=n;i++){
            if (hash[i] == 0 ){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int [] arr = {1,2,4,6,8,4,7,5,4,9,3};

        System.out.println( findMissing(arr));



    }
}
