import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FractalQestion1 {

    /*
        Given an array of integers, find the second largest distinct element. [1,2,3,4,5,6,7,5,4,3,2,5]
     */
    public static void main(String[] args) {

int [] data = new int []{1,2,3,4,5,6,7,5,4,3,2,5};
        List<Integer> list = new ArrayList<>();


        Stream<Integer> skip = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1);

        System.out.println(skip.findFirst());

    }
}
