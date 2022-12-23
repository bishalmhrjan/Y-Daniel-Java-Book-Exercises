package chapter12codes.zwölfpunktesieben;

public class NullDenominatorException extends Exception{

    private int number;

    public NullDenominatorException(int number) {
        super("invalid number "+ number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
