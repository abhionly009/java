package a15062026;

public class ThreadLocalWithExample {

    public static void main(String[] args) {


        Runnable user1 = ()->{

            UserContextWithThreadLocal.TENANT.set("Abhinandan");

            try{
                Thread.sleep(1000);


            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName()
             +" :" +
                    UserContextWithThreadLocal.TENANT.get()
            );
        };

        Runnable user2 = ()->{

            UserContextWithThreadLocal.TENANT.set("Rohit");

            try{
                Thread.sleep(1000);


            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName()
                    +" :" +
                    UserContextWithThreadLocal.TENANT.get()
            );
        };

        new Thread(user1, "Thread -1 ").start();
        new Thread(user2, "Thread -2 ").start();
    }
}
