package chapter9codes.neunpunktesieben;

import java.util.Date;

public class StopWatch {
private int startTime;
private int endTime;
private Date date ;


    public StopWatch() {
        this.startTime = (int) this.date.getTime();
    }

    public void start(){


    }

    public int getStartTime() {
        return startTime;
    }



    public int getEndTime() {
        return endTime;
    }

    public void stop(){
        this.endTime = (int) this.date.getTime();
    }
}
