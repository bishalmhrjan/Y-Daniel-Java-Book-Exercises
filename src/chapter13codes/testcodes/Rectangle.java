package chapter13codes.testcodes;

import chapter12codes.testcodes.zwolfpunkteneun.InvalidRadiusException;

import java.util.Date;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Date dateCreated, double width, double height) {
        super(dateCreated);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int height, int width) throws InvalidRadiusException {
        setHeight(height);
        setWidth(width);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws InvalidRadiusException {
        if (width > 0) {
            this.width = width;
        } else {
            throw new InvalidRadiusException(width);
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws InvalidRadiusException {

        if (height > 0) {
            this.height = height;
        } else {
            throw new InvalidRadiusException(height);
        }
    }


    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getHeight() + getWidth());
    }
}
