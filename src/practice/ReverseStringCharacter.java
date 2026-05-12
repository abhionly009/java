package practice;

public class ReverseStringCharacter {

    public static void reverseString(String input){

        char [] arr = input.toCharArray();

        int left =0;
        int right = arr.length-1;

        while(left<right){
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        System.out.println(new String(arr));



//        for (int i =arr.length-1;i>=0;i--){
//            System.out.print(arr[i]);
//        }

    }

    public static void main(String[] args) {
        reverseString("Abhinandan");
    }
}
