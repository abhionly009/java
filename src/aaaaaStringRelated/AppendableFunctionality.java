package aaaaaStringRelated;

public class AppendableFunctionality {
    private int capacity = 100;

    private char [] characters = new char[capacity];
    int index = 0;
    public  void append(char charSequence){

//        System.out.println(characters.length);

        if (index<characters.length)
        {
            characters[index++] = charSequence;
        }

//        print();
    }

    public void print(){
        for (int i =0;i<index;i++){
            System.out.print(characters[i] + "");
        }
    }

    public static void main(String[] args) {

        AppendableFunctionality appendableFunctionality = new AppendableFunctionality();
        appendableFunctionality.append('a');
        appendableFunctionality.append('b');
        appendableFunctionality.append('c');
        appendableFunctionality.append('_');
        appendableFunctionality.append('d');
        appendableFunctionality.append('e');
        appendableFunctionality.append('f');
        appendableFunctionality.append('.');
        appendableFunctionality.print();

    }
}
