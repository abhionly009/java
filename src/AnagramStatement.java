import java.util.*;

public class AnagramStatement {



    /**
     *
     * ["eat","tea","ate", "abc", "cab", "bca", "xyz"]
     *
     * group the strings that are anagrams of each other.
     *
     * [
     *   ["eat", "tea", "ate],
     *   ["abc", "cab", "bca"],
     *   ["xyz"]
     * ]
     */

    public static String sorted(String input ){

        char []arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {

        List<String> list = Arrays.asList("eat","tea","ate", "abc", "cab", "bca", "xyz");

        HashMap<String,List<String>> map = new HashMap<>();

        Iterator<String> iterator = list.iterator();

        int count =0;

        while (iterator.hasNext()){
            count++;
          String i = iterator.next();
           String key = sorted(i);
            System.out.println(key);
           if(map.containsKey(key)){
               List<String> strings = map.get(key);
               strings.add(i);
               map.put(key,strings);
           }else {
               List<String> strings = new ArrayList<>();
               strings.add(i);
               map.put(key,strings);
           }
        }

        System.out.println(map);

        System.out.println(count);
    }
}
