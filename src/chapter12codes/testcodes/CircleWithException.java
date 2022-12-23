package chapter12codes.testcodes;

import chapter12codes.testcodes.zwolfpunkteneun.InvalidRadiusException;

public class CircleWithException {
    private double radius;

    private static int numberOfCircle = 0;

    public CircleWithException() throws InvalidRadiusException{
        this(1.0);
        numberOfCircle++;

    }

    public CircleWithException(double radius) throws InvalidRadiusException {
        this.setRadius(radius);
        numberOfCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
             throw new InvalidRadiusException(radius);
        }
    }

    public static int getNumberOfCircle() {
        return numberOfCircle;
    }

    public static void setNumberOfCircle(int numberOfCircle) {
        CircleWithException.numberOfCircle = numberOfCircle;
    }
}
