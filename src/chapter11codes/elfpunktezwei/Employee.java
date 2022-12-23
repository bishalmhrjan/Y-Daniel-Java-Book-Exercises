package elfpunktezwei;

import java.util.Date;

public class Employee extends Person{

    private String office;
    private String salary;
    private Date hired;
    public Employee(String name, String phoneNumber, String emailAddresse, String office, String salary, Date hired) {
        super(name, phoneNumber, emailAddresse);
        this.office = office;
        this.salary = salary;
        this.hired = new Date();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", hired=" + hired +
                '}';
    }
}
