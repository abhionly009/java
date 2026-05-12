package arraydemo;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateInArray {

    public static void duplicate(int [] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for (int num :arr){

            if (map.containsKey(num)){
                map.remove(num);
//                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }

        }

        List<Integer> collect = new ArrayList<>(map.keySet());

        System.out.println(collect);

    }



    public static void findPairsWithHashSet(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }

        System.out.println(seen);

    }


    public static void main(String[] args) {

        int [] arr = {4,5,6,2,4,3,1,7,8,0};


//        duplicate(arr);
//

//        int [] arr2 = {1,4,5,3,2,1,5,7,8,3};
//
//        boolean equals = Arrays.equals(arr, arr2);
//        System.out.println(equals);


        findPairsWithHashSet(arr,9);
    }
}
