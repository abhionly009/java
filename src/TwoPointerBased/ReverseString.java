package TwoPointerBased;

public class ReverseString {

    public static void reverse(String str){

        char [] arr = str.toCharArray();

        int left = 0;
        int right = arr.length-1;


        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

        System.out.println(arr);
    }

    public static void main(String[] args) {

        reverse("abhinandan");

    }
}
