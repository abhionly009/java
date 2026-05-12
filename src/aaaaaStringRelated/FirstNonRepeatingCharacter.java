package aaaaaStringRelated;

public class FirstNonRepeatingCharacter {


    // Not working is expected need some modification
    private static char findNonRepeating(String input){

        char [] arr = input.toCharArray();
        int left = 0;
        int right = arr.length-1;
        char ch = '$';
        while (left<right){
            if (arr[left]!=arr[right]){
                ch = arr[left];
            }
            left++;
            right--;
        }
        return ch;
    }
    // swiss;
    public static void main(String[] args) {

        char unique = findNonRepeating("aabbc");
        System.out.println(unique);

    }
}
