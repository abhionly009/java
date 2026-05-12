package ThreadGroupDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SumOFNumbers [] jobs = {
                new SumOFNumbers(12),
                new SumOFNumbers(30),
                new SumOFNumbers(3),
                new SumOFNumbers(50)
        };

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (SumOFNumbers job :jobs){
            Future r = service.submit(job);

            System.out.println(r.get());
        }

        service.shutdown();
    }
}
