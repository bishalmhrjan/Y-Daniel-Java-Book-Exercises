package chapter12codes.testcodes.zwolfpunkteneun;

public class InvalidRadiusException extends  Exception{
    private  double radius;

    public InvalidRadiusException(double radius) {
        super("invalid radius "+ radius);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
