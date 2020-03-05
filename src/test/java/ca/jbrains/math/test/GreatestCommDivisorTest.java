package ca.jbrains.math.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreatestCommDivisorTest {

    @Test
    public void reflexive () {
        Assert.assertEquals(1, gcd(1,1));
        Assert.assertEquals(2, gcd(2,2));
        Assert.assertEquals(-1, gcd(-1,-1));
    }

    private int gcd(int a, int b){
        while(b !=0){
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
