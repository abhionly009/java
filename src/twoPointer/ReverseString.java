package twoPointer;

public class ReverseString {

    public static void reverse(String input){
        char [] arr = input.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        System.out.println("original String " + input);
        System.out.println("after revese " + new String(arr));

    }

    public static void main(String[] args) {
        reverse("Hello world");

    }
}
