package a05062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    IntegerToRoman integerToRoman;

    @BeforeEach
    void setup(){
        integerToRoman = new IntegerToRoman();
    }

    @Test
    void givenAValidIntegerReturnValidRoman(){

        assertEquals("IX", integerToRoman.convertIntToRoman(9));
    }


    @Test
    void givenAnInvalidIntegerReturnIllegalException(){
      IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class,()->integerToRoman.convertIntToRoman(-12));
        assertEquals("Integer should be positive", exception.getMessage());
    }
}
