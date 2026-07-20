package aOperationOnyourName;

public class CountVowels {

    public int totalVowels(String name){

        int count = 0;
        char [] arr = name.toLowerCase().toCharArray();

        for (int i =0;i<arr.length;i++){
            if (arr[i] == 'a'||arr[i] == 'e'|| arr[i] == 'i' || arr[i] == 'o'|| arr[i] == 'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        CountVowels countVowels = new CountVowels();

        int result = countVowels.totalVowels("Abhinandan kumar sah");
        System.out.println(result);

    }
}
