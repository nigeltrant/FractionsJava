package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFractionsTest {


    @Test
    public void zeroPlusZero() {
        Assert.assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() {
        Assert.assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() {
        Assert.assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        Assert.assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        Assert.assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonTrivialDenominator() {
        Assert.assertEquals(new Fraction(3,5), new Fraction(1,5).plus(new Fraction(2,5)));
    }

    @Test
    public void differentDenominators() {
        Assert.assertEquals(new Fraction(5,6), new Fraction(1,2).plus(new Fraction(1,3)));
    }
}

