package threadRelated;


public class WithoutFuture {
    public static void main(String[] args) {

        System.out.println("I need a pizza...");

        String pizza = orderPizza();

        System.out.println("Got pizza...");
        System.out.println("Now I can eat");
    }

    static String orderPizza()  {
        System.out.println("Pizza is being made...");
        sleep(3000); // 3 seconds
        return "Cheese Pizza";
    }
    static void sleep(int ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
