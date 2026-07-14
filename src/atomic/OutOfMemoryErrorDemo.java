package atomic;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {



    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();
        int count = 0;

        while (true){
            list.add(new int[250000000]);

            count++;

            System.out.println("Total allocation happened :" + count);
        }

    }
}
