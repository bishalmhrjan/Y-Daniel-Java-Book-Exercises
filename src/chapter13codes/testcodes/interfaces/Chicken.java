package chapter13codes.testcodes.interfaces;

public class Chicken extends Animal implements  Edible{



    @Override
    public String sound() {
        return "Chicken:cock-a-doodle-doo";
    }

    @Override
    public String hotToEat() {
        return "Chicken: Fry it";
    }
}
