package main;

/**
 * Created by Lenovo on 12/31/2015.
 */
public class RationalNumber {
    private final Integer numerator;
    private final Integer denominator;

    public RationalNumber(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber rationalNumber) {
        return new RationalNumber(this.numerator * rationalNumber.denominator + rationalNumber.numerator * this.denominator,
                denominator * rationalNumber.denominator);
    }

    public RationalNumber substract(RationalNumber rationalNumber) {
        return new RationalNumber(this.numerator * rationalNumber.denominator - rationalNumber.numerator * this.denominator,
                denominator * rationalNumber.denominator);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        RationalNumber rationalNumber = (RationalNumber) obj;
        if(rationalNumber == null){
            return false;
        }
        return (rationalNumber.numerator.equals(numerator) && rationalNumber.denominator.equals(denominator));
    }
}
