package jpmc;

public class FindSumOfDigit {
    public static int findSum(int n){

        int rem =0;
        int sum =0;

        while(n>0){
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

      int sum =  findSum(901);

        System.out.println("Sum of number 245 is  "+ sum);

    }
}
