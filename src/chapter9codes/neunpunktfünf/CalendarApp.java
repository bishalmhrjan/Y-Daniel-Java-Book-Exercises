package chapter9codes.neunpunktfünf;

import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarApp {
    private GregorianCalendar gregorianCalendar = new GregorianCalendar();
    private int year;
    private  int  month;
    private  int dayOfMonth;
    private long elapsedTime;

    public  CalendarApp(){
     this.year = getYear();
     this.month = getMonth();
     this.dayOfMonth = getDayOfMonth();
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public int getYear() {
        return this.gregorianCalendar.get  (GregorianCalendar.YEAR);
    }



    public int getMonth() {
        return this.gregorianCalendar.get(GregorianCalendar.MONTH);
    }



    public int getDayOfMonth() {
        return this.gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    public void setTimeInMillis(long sec){
        this.elapsedTime = sec;
    }
    public  long getElapsedTime(){
        return  elapsedTime;
    }
    @Override
    public String toString() {
        return "CalendarApp{" +
                "gregorianCalendar=" + this.gregorianCalendar +
                ", year=" + getYear() +
                ", month=" + getMonth() +
                ", elapsed time "+ getElapsedTime()+
                ", dayOfMonth=" + getDayOfMonth() +
                '}';
    }
}
