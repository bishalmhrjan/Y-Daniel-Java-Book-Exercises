package chapter12codes.zwölfpunktesieben;

public class MainClass {
    public static void main(String[] args) throws NullDenominatorException {
        try {
            Fraction fraction1 = new Fraction(4, 0);

            Fraction fraction = new Fraction(4, 8);
        System.out.println("Hello");
        } catch (NullDenominatorException nullDenominatorException) {
            System.out.println(nullDenominatorException);
        }
    }
}
