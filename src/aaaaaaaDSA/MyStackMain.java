package aaaaaaaDSA;

public class MyStackMain {

    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);

        myStack.push(12);
        myStack.push(42);
        myStack.push(60);
        myStack.push(90);
        myStack.push(5);

        myStack.printStack();


        System.out.println("====================");
        int top =  myStack.pop();
        System.out.println(top);
        int top1 =  myStack.pop();
        System.out.println(top1);

        System.out.println("====================");
        myStack.printStack();

        System.out.println("After Peek");
      int peeked =  myStack.peek();

        System.out.println(peeked);
    }
}
