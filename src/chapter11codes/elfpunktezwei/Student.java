package chapter11codes.elfpunktezwei;

public class Student extends Person{

    public Student(String name, String phoneNumber, String emaiAddresse) {
        super(name, phoneNumber, emaiAddresse);
    }

        enum status{
        FRESHMAN,SOPHOMORE, JUNIOR, SENIOR;

        }

    @Override
    public String toString() {
        return "Student{}";
    }
}
