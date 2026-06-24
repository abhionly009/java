package day23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GroupOfAnagramTest {

    GroupOfAnagram groupOfAnagram;

    @BeforeEach
    void setup(){
        groupOfAnagram = new GroupOfAnagram();
    }

    @Test
    void givenValidInputThenReturnValidList(){
        String [] input = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> list =   groupOfAnagram.findListAnagram(input);

        assertEquals(3,list.size());
        assertEquals(3,list.get(0).size());
        assertEquals(1,list.get(1).size());
        assertEquals(2,list.get(2).size());
    }

    @Test
    void givenNullAsInputThenReturnNullPointerException(){
        groupOfAnagram.findListAnagram(null);

        NullPointerException exception = assertThrows(NullPointerException.class,
                ()->groupOfAnagram.findListAnagram(null)
                );

        assertEquals("Input can not be null", exception.getMessage());
    }
}
