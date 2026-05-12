package ListInterfaceDemo;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListClassDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(54);
        list.add(12);
        list.add(66);
        list.add(null);
        list.add(54);
        list.add(null);
        list.add(6);
        System.out.println(list);


        LinkedList<Integer> ll = new LinkedList<>();


        ll.add(12);
        ll.add(54);
        ll.add(12);
        ll.add(66);
        ll.add(null);
        ll.add(54);
        ll.add(null);
        ll.add(6);
        System.out.println(ll);


        Vector<Integer> vector = new Vector<>();

        vector.add(12);
        vector.add(54);
        vector.add(12);
        vector.add(66);
        vector.add(null);
        vector.add(54);
        vector.add(null);
        vector.add(6);
        System.out.println(vector);


        Stack<Integer> stack = new Stack<>();

        stack.add(12);
        stack.add(54);
        stack.add(12);
        stack.add(66);
        stack.add(null);
        stack.add(54);
        stack.add(null);
        stack.add(6);
        System.out.println(stack);


    }
}
