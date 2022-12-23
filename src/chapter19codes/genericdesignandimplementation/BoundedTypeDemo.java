package chapter13codes.testcodes.genericdesignandimplementation;

import chapter12codes.testcodes.zwolfpunkteneun.InvalidRadiusException;
import chapter13codes.testcodes.Circle;
import chapter13codes.testcodes.GeometricObject;
import chapter9codes.neunpunkteeins.Rectangle;

public class BoundedTypeDemo {
    public static  void  main(String [] args) throws InvalidRadiusException {
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(4);


        System.out.println("same area " + equalArea(circle, rectangle));
    }




    public static  <E extends GeometricObject> boolean equalArea(E obj1, E obj2){
        return obj1.getArea() == obj2.getArea();
    }
}
