package chapter9codes.neunpunktfünf;

public class AppCalendar {
    public static  void main(String [] args){

        CalendarApp calendarApp = new CalendarApp();
        calendarApp.setTimeInMillis(1234567898765L);
        System.out.println(calendarApp.toString());

    }
}
