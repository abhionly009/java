package a05062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidParenthesisTest {

    ValidParenthesis validParenthesis;

    @BeforeEach
    void setup(){
        validParenthesis = new ValidParenthesis();
    }

    @Test
    void givenInputIsValidParenthesisThenReturnTrue(){
        assertEquals(true,validParenthesis.isValidParenthesis("(())"));
    }

    @Test
    void givenInputIsInvalidParenthesisThenReturnFalse(){
        assertEquals(false,validParenthesis.isValidParenthesis("((())"));
    }

    @Test
    void givenInputIsNullThenReturnNullPointerException(){
      NullPointerException exception = assertThrows(NullPointerException.class,()->validParenthesis.isValidParenthesis(null));
        assertEquals("Input can not be null ",exception.getMessage());
    }
}
