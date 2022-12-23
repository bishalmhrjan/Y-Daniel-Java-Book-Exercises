package chapter11codes.elfpunktezwei;

import java.util.Date;

public class Faculty extends Employee{
    private String hours;
    private String rank;
    public Faculty(String name, String phoneNumber, String emailAddresse, String office, String salary, Date hired, String hours, String rank) {
        super(name, phoneNumber, emailAddresse, office, salary, hired);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "hours='" + hours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
