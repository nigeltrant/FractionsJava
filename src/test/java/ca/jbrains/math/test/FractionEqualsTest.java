package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() {
        Assert.assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerators() {
        Assert.assertNotEquals(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    public void differentDenominators() {
        Assert.assertNotEquals(new Fraction(3,4), new Fraction(3,7));
    }
}

