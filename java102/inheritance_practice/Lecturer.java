package inheritance_practice;

public class Lecturer extends Academician {
    private String doorNumber;

    public Lecturer(String name, String surname, String phoneNumber, String mailAdress, String department, String title, String doorNumber) {
        super(name, surname, phoneNumber, mailAdress, department, title);
        this.doorNumber = doorNumber;
    }

    public void attend_a_meeting() {
        System.out.println("Lecturer " + this.getName() + " " + this.getSurname() + " is not at " + this.doorNumber);
    }

    public void make_a_test() {
        System.out.println("Lecturer " + this.getName() + " " + this.getSurname() + " is making an exam.");
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
}
