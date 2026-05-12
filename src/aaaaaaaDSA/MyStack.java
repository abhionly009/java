package aaaaaaaDSA;

public class MyStack {

    int [] arr;
    int size;

    int top = -1;
    MyStack (int capacity){
        arr = new int[capacity];
        size = capacity;
    }

    public void push(int x){
        if (top == arr.length-1){
            throw new RuntimeException("There is not enough space available");
        }

        arr[++top] = x;
        }




    public int pop(){
        if (top == -1){
            throw new RuntimeException("There is no item available ");
        }

        return arr[top--];
    }


    public int peek(){
        if (top==-1){
            throw new RuntimeException("There is no item");
        }
        return arr[top];
    }

    public void printStack(){

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
