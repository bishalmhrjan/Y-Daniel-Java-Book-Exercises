package chapter9codes.neunpunkteacht;

public class Fan {
    public final static int SLOW = 1;
    public final static  int MEDIUM = 2;
    public final static  int FAST = 3;


    private int speed  ;
    private boolean isOn  ;
    private double radius  ;
    private String color  ;

    public Fan() {
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5;
        this.color ="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.isOn()){
            return "Fan{" +
                    "speed=" + getSpeed() +
                    ", isOn=" + isOn +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    '}';
        }
        return "Fan{" +
                " radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
