package chapter13codes.testcodes;

import chapter12codes.testcodes.zwolfpunkteneun.InvalidRadiusException;

public class MainClass {
    public static void main(String [] args) throws InvalidRadiusException {
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(5,3);

        System.out.println("The two objects have the same area? "+ equalArea(geometricObject1,geometricObject2));
    }
    public static  boolean equalArea(GeometricObject obj1, GeometricObject obj2){
        return  obj1.getArea() == obj2.getArea();
    }

}
