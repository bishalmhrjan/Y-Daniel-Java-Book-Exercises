package chapter11codes.elfpunktezwei;

import java.util.Date;

public class Staff extends Employee{
    private  String title;
    public Staff(String name, String phoneNumber, String emailAddresse, String office, String salary, Date hired, String title) {
        super(name, phoneNumber, emailAddresse, office, salary, hired);
        this.title = title;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
