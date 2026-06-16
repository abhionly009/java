package a15062026;

public class ThreadLocalWithoutItExamplePart2 {

    public static void main(String[] args) {

        Runnable user1 =()->{

            UserContext.currentUser = "abhi";

            try {
                Thread.sleep(1000);

            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }

            System.out.println(
                    Thread.currentThread().getName() +" :" +
                            UserContext.currentUser
            );

        };

        Runnable user2 =()->{

            UserContext.currentUser = "Rohit";

            try {
                Thread.sleep(1000);

            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }

            System.out.println(
                    Thread.currentThread().getName() +" :" +
                            UserContext.currentUser
            );

        };

        new Thread(user1, "THread -1").start();
        new Thread(user2, "THread -2").start();


    }
}
