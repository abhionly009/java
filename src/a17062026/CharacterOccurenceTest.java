package a17062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CharacterOccurenceTest {

    CharacterOccurence characterOccurence;

    @BeforeEach
    void setUp (){
        characterOccurence = new CharacterOccurence();
    }

    @Test
    void testGivenStringIsNullThenThrowNullPointer(){

        NullPointerException exception = assertThrows(NullPointerException.class, ()->{characterOccurence.count(null);});

        assertEquals("Input can not be null",exception.getMessage());

    }

    @Test
    void testGivenStringIsValidThenReturnValidMap(){
       Map<Character,Long> actualResult = characterOccurence.count("abhinandan shah");

        assertEquals(8, actualResult.size());
        assertEquals(1, actualResult.get(' '));
        assertEquals(4, actualResult.get('a'));
        assertEquals(3, actualResult.get('h'));
    }

}
