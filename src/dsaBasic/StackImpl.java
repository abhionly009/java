package dsaBasic;

public class StackImpl {

    Object [] arr = new Object[10];
    int top = -1;
    public void push(Object obj){
        if (top == -1){
            arr[++top] = obj;
        }
        if (top==arr.length-1){
            throw new RuntimeException("stack is full");
        }
        arr[++top] = obj;
    }

    public Object pop(){
        if (top == -1){
            throw new RuntimeException("There is no item in stack at the moment!");
        }

        return arr[top--];

    }

    public Object peek(){
        return arr[top];
    }


    public void printStack(){
        for (Object object: arr){
            System.out.println(object);
        }
    }


    public static void main(String[] args) {

        StackImpl stack = new StackImpl();

        stack.push("Abhinandan");
        stack.push(90);
        stack.push("Rohan");
        stack.push(true);
        stack.push("Lokesh");
        stack.push("Sharma");
        stack.printStack();

        System.out.println("---------------------");
        Object returnedObject = stack.pop();
        System.out.println(returnedObject);

        stack.pop();
        stack.printStack();

        System.err.println(stack.peek());
    }

}
