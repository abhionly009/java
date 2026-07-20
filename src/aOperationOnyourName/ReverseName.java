package aOperationOnyourName;

public class ReverseName {

    public String reverse(String name){

        int left = 0;
        int right = name.length()-1;
        char [] arr = name.toCharArray();
        while(left<right){
            char ch = arr[right];
            arr[right] = arr[left];
            arr[left]= ch;
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        ReverseName reverseName = new ReverseName();
        String name = "Abhinandan";
        String result = reverseName.reverse(name);

        System.out.println("Original name " + name);

        System.out.println("After reverse "+result);


    }
}
