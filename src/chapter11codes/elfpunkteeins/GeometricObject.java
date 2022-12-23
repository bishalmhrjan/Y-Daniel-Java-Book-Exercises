package chapter11codes.elfpunkteeins;

import java.util.Date;

public class GeometricObject {
    private String color ="white";
    private boolean filled;
    private Date date;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.date = new Date();
    }


    public  GeometricObject(){
        this.date = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", date=" + date +
                '}';
    }


}
