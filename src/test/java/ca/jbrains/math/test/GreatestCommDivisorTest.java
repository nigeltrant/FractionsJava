package ca.jbrains.math.test;

import ca.jbrains.math.NumberTheory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreatestCommDivisorTest {

    @Test
    public void reflexive () {
        Assert.assertEquals(1, NumberTheory.gcd(1,1));
        Assert.assertEquals(2, NumberTheory.gcd(2,2));
        Assert.assertEquals(1, NumberTheory.gcd(-1,-1));
    }

    @Test
    public void relativelyPrime() {
        Assert.assertEquals(1, NumberTheory.gcd(2,3));
        Assert.assertEquals(1, NumberTheory.gcd(4,7));
        Assert.assertEquals(1, NumberTheory.gcd(-2,-3));
        Assert.assertEquals(1, NumberTheory.gcd(-2,3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        Assert.assertEquals(3, NumberTheory.gcd(3,9));
        Assert.assertEquals(5, NumberTheory.gcd(5,30));
    }

    @Test
    public void commonFactor() {
        Assert.assertEquals(2, NumberTheory.gcd(6,8));
        Assert.assertEquals(7, NumberTheory.gcd(49,315));
    }

    @Test
    public void negatives() {
        Assert.assertEquals(3, NumberTheory.gcd(-3,9));
        Assert.assertEquals(3, NumberTheory.gcd(-3,-9));
        Assert.assertEquals(4, NumberTheory.gcd(-24,-28));
        Assert.assertEquals(4, NumberTheory.gcd(-24,28));
    }

}
