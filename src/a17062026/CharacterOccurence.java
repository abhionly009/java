package a17062026;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {

    public Map<Character,Long> count(String str){
        if (str == null){
            throw new NullPointerException("Input can not be null");
        }

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return collect;
    }

    public static void main(String[] args) {

        CharacterOccurence characterOccurence = new CharacterOccurence();
        String str = "abhinandan shah";

        System.out.println(characterOccurence.count(str));

    }
}
