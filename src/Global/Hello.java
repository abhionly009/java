package Global;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Hello {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("manoj");
        names.add("Abhina");
        names.add("rahul");
        names.add("bob");

        Stream<String> sorted = names.stream().sorted(Comparator.reverseOrder());

        sorted.forEach(System.out::println);
    }
}
