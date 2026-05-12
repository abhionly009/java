package aaaaaaaDSA;

public class MyQueue {
    int [] arr;
    int front = 0;
    int rear = 0;
    int size = 0;

    public MyQueue(int capacity){
        arr = new int[capacity];
        size = capacity;
    }

    public void enqueue(int x){
        if (rear == size){
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = x;
    }

    public void print(){
        for(int i = front;i<rear; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public int dequeue()
    {
        if (front == rear){
            return -1;
        }
        return arr[front++];
    }

}
