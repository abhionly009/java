package threadRelated;

import java.util.concurrent.*;

public class WithFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println(" I need a pizza...");
        CompletableFuture

        Future<String> pizzaFuture = executor.submit(()->orderPizza());
        System.out.println("While waiting, I am watching TV...");
        System.out.println("While waiting, I am drinking juice...");
        System.out.println("While waiting, I am reading news...");

        // Now I actually need the pizza — get() waits here
        String pizza = pizzaFuture.get();
        System.out.println("Got: " + pizza);
        System.out.println("Now I can eat!");

        executor.shutdown();
    }

    static String orderPizza(){
        System.out.println("Pizza is being made in background...");
        sleep(3000);
        return "Cheese Pizza";
    }

    static void sleep(int ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
