package inheritance_practice;

public class Officer extends Worker {
    private String department;
    private String workTime;

    public Officer(String name, String surname, String phoneNumber, String mailAdress, String department, String workTime) {
        super(name, surname, phoneNumber, mailAdress);
        this.department = department;
        this.workTime = workTime;
    }

    public void work() {
        System.out.println(this.getName() + " " + this.getSurname() + " is working " + workTime);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return super.toString() + " Officer{" +
                "department='" + department + '\'' +
                ", workTime='" + workTime + '\'' +
                '}';
    }
}
