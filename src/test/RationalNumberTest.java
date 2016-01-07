package test;

import main.RationalNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lenovo on 12/31/2015.
 */
public class RationalNumberTest {

    @Test
    public void shouldBeAbleToAddTwoRationalNumbers(){
        RationalNumber rationalNumber = new RationalNumber(1, 2);
        assertEquals(new RationalNumber(9, 10), rationalNumber.add(new RationalNumber(2, 5)));
    }

    @Test
    public void shouldBeAbleToSubstractRationalNumber(){
        RationalNumber rationalNumber = new RationalNumber(3, 4);
        assertEquals(new RationalNumber(11, 20), rationalNumber.substract(new RationalNumber(1, 5)));
    }

    @Test
    public void shouldBeAbleToMultiplyRationalNumber(){
        RationalNumber rationalNumber = new RationalNumber(1, 2);
        assertEquals(new RationalNumber(1, 5), rationalNumber.multiply(new RationalNumber(2, 5)));
    }

    @Test
    public void shouldBeAbleToAddRationalNumberAndSimplify(){
        RationalNumber rationalNumber = new RationalNumber(2, 4);
        assertEquals(new RationalNumber(5, 8), rationalNumber.add(new RationalNumber(2, 16)));
    }

    @Test
    public void shouldBeAbleToDivideRationNumberAndSimplify(){
        RationalNumber rationalNumber = new RationalNumber(1, 2);
        assertEquals(new RationalNumber(3, 1), rationalNumber.divide(new RationalNumber(1, 6)));
    }

}
