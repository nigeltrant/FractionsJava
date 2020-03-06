package ca.jbrains.math.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreatestCommDivisorTest {

    @Test
    public void reflexive () {
        Assert.assertEquals(1, gcd(1,1));
        Assert.assertEquals(2, gcd(2,2));
        Assert.assertEquals(1, gcd(-1,-1));
    }

    @Test
    public void relativelyPrime() {
        Assert.assertEquals(1, gcd(2,3));
        Assert.assertEquals(1, gcd(4,7));
        Assert.assertEquals(1, gcd(-2,-3));
        Assert.assertEquals(1, gcd(-2,3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        Assert.assertEquals(3, gcd(3,9));
        Assert.assertEquals(5, gcd(5,30));
    }

    @Test
    public void commonFactor() {
        Assert.assertEquals(2, gcd(6,8));
        Assert.assertEquals(7, gcd(49,315));
    }

    @Test
    public void negatives() {
        //I'am not sure whether I like this behaviour.
        // I probably prefer that GCD always be positive.
        Assert.assertEquals(3, gcd(-3,9));
        Assert.assertEquals(3, gcd(-3,-9));
        Assert.assertEquals(4, gcd(-24,-28));
        Assert.assertEquals(4, gcd(-24,28));
    }

    private int gcd(int a, int b){
        while(b !=0){
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }
}
