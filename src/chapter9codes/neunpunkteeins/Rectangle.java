package chapter9codes.neunpunkteeins;

import chapter13codes.testcodes.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width ;
    private double height;

    public Rectangle(){
    this(1.0, 1.0);
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return  2*(width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +" area "+ this.getArea()+ " perimeter "+this.getPerimeter()+
                '}';
    }
}
