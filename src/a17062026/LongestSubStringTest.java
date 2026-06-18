package a17062026;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LongestSubStringTest {

    LongestSubString longestSubString = new LongestSubString();

    @Test
     void testGivenValidString(){
        int desiredOutput = longestSubString.findLongestSubString("abcabcbb");
        assertEquals(desiredOutput, 3);
    }

    @Test
    void testGivenStringWhichDoesNotHaveLongestSubString(){
        assertEquals(0,longestSubString.findLongestSubString(""));
    }

    @Test
    void testGivenStringWithSameCharacterThenShouldReturnOne(){
        assertEquals(1, longestSubString.findLongestSubString("aaaaaaaaaa"));
    }

    @Test
    void testGivenStringAsNullThenShouldReturnNullPointer(){
       NullPointerException exception = assertThrows( NullPointerException.class, ()->{longestSubString.findLongestSubString(null);});
       assertEquals("Input string should not be null", exception.getMessage());

    }

}
