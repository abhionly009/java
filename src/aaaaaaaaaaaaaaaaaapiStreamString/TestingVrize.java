package aaaaaaaaaaaaaaaaaapiStreamString;

public class TestingVrize {


    public static void main(String[] args) {
        int input_number= 10;

        Thread1 oddThread = new Thread1();
        Thread2 evenThread = new Thread2();

        Thread t = new Thread(oddThread);
        Thread t2 = new Thread(evenThread);
        t.start();
        t2.start();
        for (int i =0;i<=input_number;i++){
            if (i%2==0){
                System.out.println("for even number" +i);
                t2.run();
            }else {
                System.out.println("for odd number" + i);
                t.run();
            }
        }

    }

}
