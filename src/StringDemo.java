public class StringDemo {

    public static void main(String[] args) {


        String input = "Abhinandan shah";

      char [] arr =  input.replace(" ","").toLowerCase().toCharArray();
      int vowels =0;
      int consta =0;
      for (int i=0;i<arr.length;i++){

          if (arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o' || arr[i]=='u'){
              vowels++;
          }else {
              consta++;
          }
      }

        System.out.println("Total Vowels " +vowels);
        System.out.println("Total Constnant " +consta);


    }
}
