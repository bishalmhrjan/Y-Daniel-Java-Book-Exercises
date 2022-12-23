package chapter9codes.neunpunktedrei;

import java.util.Date;

public class NeunPunkDrei {
private Date date;

    public NeunPunkDrei(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NeunPunkDrei{" +
                "date=" + date +
                '}';
    }
public static  void main(String [] args){
    Date date = new Date(10000);
    System.out.println(    date.getTime());
}


}
