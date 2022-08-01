package inheritance_practice;

public class Assistant extends Academician {
    private String officeHours;

    public Assistant(String name, String surname, String phoneNumber, String mailAdress, String department, String title, String officeHours) {
        super(name, surname, phoneNumber, mailAdress, department, title);
        this.officeHours = officeHours;
    }

    public void makeQuiz() {
        System.out.println("Assistant " + this.getName() + " " + this.getSurname() + " is making a quiz.");
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

}
