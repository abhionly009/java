package aaaaaaaDSA.twopointer;

public class ReverseAString {

    public static String reverse(String input ){

        int left = 0;
        int right = input.length()-1;

        char [] arr = input.toCharArray();

        while(left<right){
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }


    public static void main(String[] args) {
        String input = new String("Hello world");
        String result = reverse(input);

        System.out.println(input);
        System.out.println(result);

    }
}
