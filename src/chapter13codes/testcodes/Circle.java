package chapter13codes.testcodes;

import chapter12codes.testcodes.zwolfpunkteneun.InvalidRadiusException;

import java.util.Date;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(String color, boolean filled, double radius) throws InvalidRadiusException {
        super(color, filled);
         setRadius(radius);
    }

    public Circle(Date dateCreated, double radius) throws  InvalidRadiusException {
        super(dateCreated);
        setRadius(radius);
     }

    public Circle(double radius) throws  InvalidRadiusException {
        setRadius(radius);


    }


    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI*this.getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius >= 0){
            this.radius = radius;

        } else {
            throw  new InvalidRadiusException(radius);
        }
    }
}
