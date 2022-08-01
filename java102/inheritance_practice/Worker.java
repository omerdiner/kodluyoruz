package inheritance_practice;

public class Worker {
    private String name;
    private String surname;
    private String phoneNumber;
    private String mailAdress;

    public Worker(String name, String surname, String phoneNumber, String mailAdress) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.mailAdress = mailAdress;
    }


    public void entry() {
        System.out.println(name + " " + surname + " came to work.");
    }

    public void exit() {
        System.out.println(name + " " + surname + " left work.");
    }

    public void eatLunch() {
        System.out.println(name + " " + surname + " eating lunch.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mailAdress='" + mailAdress + '\'' +
                '}';
    }
}
