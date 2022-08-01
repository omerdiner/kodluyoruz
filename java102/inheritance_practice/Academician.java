package inheritance_practice;

public class Academician extends Worker {
    private String department;
    private String title;

    public Academician(String name, String surname, String phoneNumber, String mailAdress, String department, String title) {
        super(name, surname, phoneNumber, mailAdress);
        this.department = department;
        this.title = title;
    }

    public void attendClass() {
        System.out.println(this.title + " " + this.getName() + " is in the class.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void entry() {
        System.out.println(title + " " + this.getName() + " has come to the faculty.");
    }

    @Override
    public String toString() {
        return super.toString() + " Academician{" +
                "department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
