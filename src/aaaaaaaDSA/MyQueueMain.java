package aaaaaaaDSA;

public class MyQueueMain {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(12);
        myQueue.enqueue(20);
        myQueue.enqueue(90);
        myQueue.enqueue(17);
        myQueue.enqueue(45);
        myQueue.enqueue(100);

        myQueue.print();

       int as =  myQueue.dequeue();
        System.out.println(as);

        myQueue.print();
    }
}
