package basicArrayAndString;

public class DuplicateInArray {


    public static int findDuplicateBrute(int [] arr){
        int duplicate =0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    duplicate = arr[i];
                    break;
                }
            }
        }
        return duplicate;

    }

    public static int findDuplicateOptimal(int [] arr){
        int left = 0;
        int right = arr.length-1;
        int duplicate = 0;

        while(left<right){

            if (arr[left]!= arr[right]){
                right--;
                left++;
            }else if (arr[left]== arr[right]){
                duplicate = arr[left];
                break;
            }

        }


        return duplicate;
    }


    public static void main(String[] args) {

//        int [] input = {1,3,4,2,2};
        int [] input = {5,3,1,3,4,2};
//        int duplicate = findDuplicateBrute(input);
        int duplicate = findDuplicateOptimal(input);

        System.out.println(duplicate);


    }
}
