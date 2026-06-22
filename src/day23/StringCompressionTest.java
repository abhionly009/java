package day23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCompressionTest {

    StringCompression compression ;

    @BeforeEach
    void setup(){
        compression = new StringCompression();
    }

    @Test
    void givenNullInputThenReturnNullPointer(){

      NullPointerException exception =  assertThrows(NullPointerException.class,()->compression.compress(null));

      assertEquals("Input can not be null",exception.getMessage());


    }

    @Test
    void givenValidStringThenReturnValidResult(){

        assertEquals("a3b2c1",compression.compress("aaabbc"));

    }
}
