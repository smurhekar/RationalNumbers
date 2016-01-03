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
                denominator * rationalNumber.denominator).simplify();
    }

    public RationalNumber substract(RationalNumber rationalNumber) {
        return new RationalNumber(this.numerator * rationalNumber.denominator - rationalNumber.numerator * this.denominator,
                denominator * rationalNumber.denominator);
    }

    public RationalNumber multiply(RationalNumber rationalNumber) {
        RationalNumber rationalNumber1 = new RationalNumber(this.numerator * rationalNumber.numerator, this.denominator * rationalNumber.denominator);
        return rationalNumber1.simplify();
    }

    private RationalNumber simplify() {
        int start = 2;
        int end  = 0;
        end = getEndNumber();
        while(start <= end){
            if(isDivisibleBy(start)){
                RationalNumber newRationalNumber = new RationalNumber(numerator / start, denominator / start);
                if(!isSimilarTo(newRationalNumber)) {
                    return newRationalNumber.simplify();
                }
            }
            start++;
        }
        return new RationalNumber(numerator, denominator);
    }

    private boolean isSimilarTo(RationalNumber newRationalNumber) {
        return this.equals(newRationalNumber);
    }

    private Integer getEndNumber() {
        return (numerator > denominator) ? numerator : denominator;
    }

    private boolean isDivisibleBy(int start) {
        return numerator % start == 0 && denominator % start == 0;
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
