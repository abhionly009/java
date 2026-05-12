package twoPointer;

public class MoveZero2End {

    public static void reshapeArray(int [] input){

        int pos =0;
        for (int i=0;i<input.length;i++){
            if (input[i]!=0){
                input[pos++] = input[i];
            }
        }

        while(pos<input.length){
            input[pos++] =0;
        }


        for (int a: input){
            System.out.print( a  + " ");
        }
    }

    public static void main(String[] args) {
        int []input = {1,9,3,0,5,0,8};//
//        int [] input = {1,0,-1,2,0,1};
        reshapeArray(input);
    }
}
