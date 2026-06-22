package day23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FirstNonRepeatingCharacterTest {

    FirstNonRepeatingCharacter firstNonRepeatingCharacter;

    @BeforeEach
    void setup(){
        firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
    }

    @Test
    void givenNullInputThenReturnNullPointerException(){

       NullPointerException exception = assertThrows(NullPointerException.class,()->firstNonRepeatingCharacter.findCharacter(null));

       assertEquals("Input should not be empty",exception.getMessage());

    }

    @Test
    void givenValidInputThenReturnFirstNonRepeatingCharacter(){

        assertEquals('c',firstNonRepeatingCharacter.findCharacter("aabbcdde"));

    }


}
