package chapter12codes.testcodes.zwolfpunkteneun;

import chapter12codes.testcodes.CircleWithException;

public class MainClass {
    public static void main(String [] args) {
        try {
            new CircleWithException(5);
            new CircleWithException(-5);
        } catch (InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.println("total cicle created "+ CircleWithException.getNumberOfCircle());
    }
}
