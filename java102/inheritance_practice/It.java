package inheritance_practice;

public class It extends Officer {
    private String field;

    public It(String name, String surname, String phoneNumber, String mailAdress, String department, String workTime, String field) {
        super(name, surname, phoneNumber, mailAdress, department, workTime);
        this.field = field;
    }

    public void make_a_network_test() {
        System.out.println("It officer " + this.getName() + " " + this.getSurname() + " is making a network test .");
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
