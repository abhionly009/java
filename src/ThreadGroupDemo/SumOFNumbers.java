package ThreadGroupDemo;

import java.util.concurrent.Callable;

public class SumOFNumbers implements Callable {

    int limit =0;
    SumOFNumbers(int limit){
        this.limit =limit;
    }

    @Override
    public Object call() throws Exception {
        int sum =0;

        for (int i=1;i<=limit;i++){
            sum = sum +i;
        }
        return sum;
    }
}
