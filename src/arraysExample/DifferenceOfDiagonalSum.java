package arraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceOfDiagonalSum {



    public static int difference(List<List<Integer>> ar){

        int rightDiagonal = 0;
        int leftDiagonal = 0;
         int n = ar.size();

        for (int i=0;i<n;i++)
        {
            System.out.println(ar.get(i).get(i));
            leftDiagonal += ar.get(i).get(i);
            rightDiagonal += ar.get(i).get(n-1-i);
        }

        return Math.abs(leftDiagonal-rightDiagonal);

    }


    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(11,2,4));
        list.add(Arrays.asList(4,5,6));
        list.add(Arrays.asList(10,8,-12));
//        difference(list);
        System.out.println( difference(list)    );
    }
}
