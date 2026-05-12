package aaaaaaaSystemDesign;

public class RateLimiterMain {

    public static void main(String[] args) throws InterruptedException {


//        RateLimiter limiter = new RateLimiter(5, 60_000); // 5 req/min


        RateLimiter limiter = new RateLimiter(3, 5000); // 3 requests per 5 sec

        for (int i = 1; i <= 5; i++) {
            boolean allowed = limiter.allowRequest("client1");
            System.out.println("Request " + i + ": " + allowed);
        }

        Thread.sleep(5000);

        System.out.println("After window reset:");

        for (int i = 1; i <= 3; i++) {
            boolean allowed = limiter.allowRequest("client1");
            System.out.println("Request " + i + ": " + allowed);
        }
    }


}
