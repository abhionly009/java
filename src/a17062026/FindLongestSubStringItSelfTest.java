package a17062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindLongestSubStringItSelfTest {

    FindLongestSubStringItself longestSubStringItself;

    @BeforeEach
    void setUp() {
        longestSubStringItself = new FindLongestSubStringItself();
    }
    @Test
    void testGivenStringIsValidThenReturnValidSubString(){
        assertEquals("wke", longestSubStringItself.findSubString("pwwkew"));
    }

    @Test
    void testGivenStringIsNullThenReturnNullPointer(){
       NullPointerException exception = assertThrows(NullPointerException.class, ()->longestSubStringItself.findSubString(null));
        assertEquals("Input can not be null",exception.getMessage());
    }

    @Test
    void testGivenStringIsEmptyThenReturnEmpty(){
        assertEquals("", longestSubStringItself.findSubString(""));
    }

    @Test
    void testGivenStringIsSameCharacterThenReturnOneCharacter(){
        assertEquals("a",longestSubStringItself.findSubString("aaaaaaaaa"));
    }
}
