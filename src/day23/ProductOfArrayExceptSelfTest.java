package day23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    void setup(){
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    void givenValidInputThenReturnOutputArray(){

        int [] input = {1,2,3,4};
      int [] result =  productOfArrayExceptSelf.findProduct(input);

        assertEquals(4,result.length);
        assertEquals(24,result[0]);
        assertEquals(12,result[1]);
        assertEquals(8,result[2]);
        assertEquals(6,result[3]);
    }


    @Test
    void givenValidInputWithOneZeroThenReturnOutputArrayWithOneNonZero(){
        int [] input = {1,2,3,0};
        int [] result = productOfArrayExceptSelf.findProduct(input);
        assertEquals(4,result.length);
        assertEquals(0,result[0]);
        assertEquals(0,result[1]);
        assertEquals(0,result[2]);
        assertEquals(6,result[3]);
    }

    @Test
    void givenArrayAsNullThenReturnNullPointer(){


        NullPointerException exception = assertThrows(NullPointerException.class,
                ()->productOfArrayExceptSelf.findProduct(null)
                );

        assertEquals("Input can not be null", exception.getMessage());
    }

}
