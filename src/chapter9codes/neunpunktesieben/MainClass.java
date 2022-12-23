package chapter9codes.neunpunktesieben;

import chapter9codes.neunpunktfünf.CalendarApp;

public class MainClass {


        public static  void main(String [] args) {

            CalendarApp calendarApp = new CalendarApp();
            calendarApp.setTimeInMillis(1234567898765L);
            System.out.println(calendarApp.toString());

        }

}
