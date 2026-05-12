package FunctionExample;

import java.util.function.Function;

public class FunctionChainingExample {



    public static void main(String[] args) {

        Function<Integer,Integer> f1 = i-> i*2;
        Function<Integer,Integer> f2 = i-> i*i*i;

        /*
         * first f1 will be applied on input in this case 2 and then f2 will be applied
         * f1 will return 4 after calculation and 2*2 = 4
         * f2 will return 64 after calculation 4*4*4 = 64
         */
        System.out.println(f1.andThen(f2).apply(2));



        /*
         * First f2 will be performed on input in this case 2 and then f1 will be applied
         * f2 will return 8 after calculation and 2*2*2 = 8
         * f1 will return 64 after calculation 8*2 = 16
         */
        System.out.println(f1.compose(f2).apply(2));

    }
}
