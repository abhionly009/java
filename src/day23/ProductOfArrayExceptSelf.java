package day23;

public class ProductOfArrayExceptSelf {

    public int product(int [] input, int currentPosition ){
        int multi = 1;
        for (int i = 0;i<input.length;i++){
            if (i != currentPosition){
                multi = multi* input[i];
            }
        }
        return multi;
    }

    public int [] findProduct( int [] input){
        int [] result = new int[input.length];

        for (int i = 0;i<input.length;i++){
            result[i]  = product(input,i);
        }
        return result;
    }

    public static void main(String[] args) {

    int [] input = {1,2,3,4};
    ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
    int [] result = product.findProduct(input);

       for (Integer n: result){
           System.out.println(n);
       }

    }
}
