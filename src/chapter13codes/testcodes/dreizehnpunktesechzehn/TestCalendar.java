package chapter13codes.testcodes.dreizehnpunktesechzehn;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public  static  void  main(String [] args){
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is "+new Date());
        System.out.println("Year "+calendar.get(Calendar.YEAR));
        System.out.println("MONTH "+calendar.get(Calendar.MONTH));
        System.out.println("HOUR "+calendar.get(Calendar.HOUR));

    }
}
