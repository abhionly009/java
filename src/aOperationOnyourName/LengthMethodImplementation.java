package aOperationOnyourName;

public class LengthMethodImplementation {

    public int findLength(String name){
        int count = 0;

        for (int i =0;i<name.length();i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        LengthMethodImplementation lengthMethodImplementation = new LengthMethodImplementation();

        int result = lengthMethodImplementation.findLength("Abhinandan");
        System.out.println(result);


    }
}
