package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ReduceFractionTest {

    @Test
    public void alreadyInLowestTerms() {
        Assert.assertEquals(new Fraction(3,4), new Fraction(3,4));
    }

    @Test
    public void reduceToNotWholeNumber() {
        Assert.assertEquals(new Fraction(3,4), new Fraction(6,8));
    }
}
