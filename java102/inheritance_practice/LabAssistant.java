package inheritance_practice;

public class LabAssistant extends Assistant {
    public LabAssistant(String name, String surname, String phoneNumber, String mailAdress, String department, String title, String officeHours) {
        super(name, surname, phoneNumber, mailAdress, department, title, officeHours);
    }

    public void makeLabWork() {
        System.out.println("Assistant " + this.getName() + " is currently working at the lab.");
    }

    @Override
    public void entry() {
        System.out.println(this.getTitle() + " " + this.getName() + " has come to the lab.");
    }
}
