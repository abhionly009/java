package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {


        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(52);
        set.add(62);
        set.add(2);
        set.add(7);
        set.add(null);

        System.out.println(set);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(12);
        linkedHashSet.add(52);
        linkedHashSet.add(62);
        linkedHashSet.add(2);
            linkedHashSet.add(7);
            linkedHashSet.add(null);
            linkedHashSet.add(7);
            linkedHashSet.add(null);

        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(12);
        treeSet.add(52);
        treeSet.add(62);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(7);
        System.out.println(treeSet);

    }
}
