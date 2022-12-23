package elfpunktezwei;

public class Person {
    private String name;
    private String phoneNumber;
    private String emaiAddresse;

    public Person(String name, String phoneNumber, String emaiAddresse) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emaiAddresse = emaiAddresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmaiAddresse() {
        return emaiAddresse;
    }

    public void setEmaiAddresse(String emaiAddresse) {
        this.emaiAddresse = emaiAddresse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emaiAddresse='" + emaiAddresse + '\'' +
                '}';
    }
}
