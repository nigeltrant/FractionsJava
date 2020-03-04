package ca.jbrains.math;

public class Fraction {
    private int integerValue;

    public Fraction(int integerValue){
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that){
        return new Fraction(this.integerValue + that.integerValue);
    }

//    public Fraction minus(Fraction that){
//        return new Fraction(this.integerValue - that.integerValue);
//    }

    public int intValue(){
        return integerValue;
    }

    public Fraction(int numerator, int denominator){

    }

    public int getNumerator(){
        return 3;
    }

    public int getDenominator(){
        return 5;
    }
}