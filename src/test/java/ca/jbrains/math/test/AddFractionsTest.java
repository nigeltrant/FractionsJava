package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Ignore;
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
    public void differentDenominatorsWithoutReducing() {
        Assert.assertEquals(new Fraction(5,6), new Fraction(1,2).plus(new Fraction(1,3)));
    }

    @Test
    public void reduceResultToWhoWholeNumber() {
        Assert.assertEquals(new Fraction(1), new Fraction(1,3).plus(new Fraction(2,3)));
    }

    @Test
    public void oneDenominatorIsAMultipleOfTheOther() {
        Assert.assertEquals(new Fraction(11,8), new Fraction(3,4).plus(new Fraction(5,8)));
    }

    @Test
    public void commonFactorInDenominators() {
        Assert.assertEquals(new Fraction(11,18), new Fraction(1,6).plus(new Fraction(4,9)));
    }

    @Test
    public void reduceResultEvenWhenDenominatorsAreTheSame() {
        Assert.assertEquals(new Fraction(3,2), new Fraction(3,4).plus(new Fraction(3,4)));
    }

    @Test
    public void negativeFractionAndReducing() {
        Assert.assertEquals(new Fraction(1,2), new Fraction(-1,4).plus(new Fraction(3,4)));
        Assert.assertEquals(new Fraction(-1,8), new Fraction(3,8).plus(new Fraction(-1,2)));
    }

    @Test
    @Ignore("Constructor doesn't yet avoid negative denominators")
    public void negativeSignsEverywhere() {
        Assert.assertEquals(new Fraction(1,2), new Fraction(1,-4).plus(new Fraction(-3,-4)));
    }
}

