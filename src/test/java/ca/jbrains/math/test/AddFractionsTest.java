package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        Assert.assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        Assert.assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        Assert.assertEquals(5,   new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        Assert.assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        Assert.assertEquals(-2,new Fraction(-3).plus(new Fraction(1)).intValue());
    }

    @Test
    public void nonTrivialDenominator() {
        final Fraction sum = new Fraction(1,5).plus(new Fraction(2,5));
        Assert.assertEquals(3, sum.getNumerator());
        Assert.assertEquals(5, sum.getDenominator());
    }
}

