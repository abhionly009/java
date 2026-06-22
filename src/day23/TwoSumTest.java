package day23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    TwoSum twoSum;
    int [] input;


    @BeforeEach
    void setup(){
        twoSum = new TwoSum();
        input = new int[]{2, 7, 11, 15};

    }

    @Test
    void givenValidInputArrayAndTargetIsFoundReturnValidArrayIndex(){

       int [] result =  twoSum.findIndexOfTwoNumbers(input, 9);

       assertEquals(0 , result[0]);
       assertEquals(1,result[1] );

    }

    @Test
    void givenValidInputArrayAndTargetNotFoundReturnInvalidArrayIndex(){

        int [] result = twoSum.findIndexOfTwoNumbers(input,44);
        assertEquals(-1,result[0]);
        assertEquals(-1,result[1]);
    }


    @Test
    void givenNullArrayThenReturnNullPointer(){

     NullPointerException exception =
             assertThrows(NullPointerException.class,()->{twoSum.findIndexOfTwoNumbers(null,33);
             });

     assertEquals("Input can not be null",exception.getMessage());

    }
}
