package ca.jbrains.math;

public class Fraction {
    private final int denominator;
    private final int numerator;
    private final int integerValue;

    public Fraction(int integerValue){
        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator){
        this.integerValue = numerator;
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction plus(Fraction that){
        return new Fraction(this.integerValue + that.integerValue, denominator);
    }

    public Fraction minus(Fraction that){
        return new Fraction(this.integerValue - that.integerValue);
    }

    public int intValue(){
        return integerValue;
    }



    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }
}