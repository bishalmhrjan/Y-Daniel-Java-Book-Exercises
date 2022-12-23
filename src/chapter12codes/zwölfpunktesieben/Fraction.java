package chapter12codes.zwölfpunktesieben;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) throws NullDenominatorException{

        this.numerator = numerator;
        setDenominator(denominator);
            }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator)   {
      this.numerator= numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws NullDenominatorException {
        if(this.denominator!= 0){
            this.denominator = denominator;
        }
        else {
            throw  new NullDenominatorException(denominator);
        }
    }
}
