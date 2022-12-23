package chapter9codes.neunpunkteacht;

public class MainClassFan {
    public static  void main(String [] args){
        Fan fan = new Fan();
        fan.setOn(true);
        System.out.println(fan.toString());


        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        System.out.println(fan1.toString());



        Fan fan2 = new Fan();
        fan1.setColor("blue");
        fan1.setRadius(5);
        fan1.setOn(false);
        fan1.setSpeed(Fan.FAST);
        System.out.println(fan1.toString());


    }
}
