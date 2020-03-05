package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() {
        Assert.assertEquals(new Fraction(3,5), new Fraction(3,5));
    }
}
