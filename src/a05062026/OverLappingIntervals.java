package a05062026;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OverLappingIntervals {



    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();

        intervals.add(new int[]{1, 4});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{7, 10});
        intervals.add(new int[]{9, 15});

        intervals.sort(Comparator.comparingInt(interval -> interval[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals.get(0)[0];
        int end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {

            int currentStart = intervals.get(i)[0];
            int currentEnd = intervals.get(i)[1];

            // Overlapping
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }
            // No overlap
            else {
                result.add(new int[]{start, end});

                start = currentStart;
                end = currentEnd;
            }
        }

        result.add(new int[]{start, end});


        for (int [] data :result){
        System.out.println(data[0] +" "+ data[1]);
        }
    }
}
