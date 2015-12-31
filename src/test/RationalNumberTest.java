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
}
