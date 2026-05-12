package arraysExample;

public class EvenAndOddInArray {

    public static void main(String[] args) {


        Integer [] arr = new Integer[10];

        arr[0] =5;
        arr[1] =10;
        arr[2] =13;
        arr[3] =7;
        arr[4] =5;
        arr[5] =8;
        arr[6] =3;
        arr[9] =21;

        for (int i=0;i<arr.length;i++){
            if (arr[i] == null){
                System.out.println("No assignment");
            }
            else if (arr[i]%2==0){
                System.out.println( arr[i] +  "  Even");
            }else {
                System.out.println(arr[i] + " Odd ");
            }
        }


    }
}
