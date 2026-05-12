package concurrentCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(12);
        data.add(23);
        data.add(43);
        data.add(56);


        Collections.synchronizedList(data);


    }

}
