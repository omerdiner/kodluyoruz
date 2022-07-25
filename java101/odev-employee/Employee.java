public class Employee {
    final int MIN_TAX_AMOUNT = 1000;
    final int CURRENT_YEAR = 2021;
    final double TAX_PERCENTAGE = 0.03;
    final int MAX_WORK_HOUR = 40;
    final int HOURLY_FEE = 30;

    String name;
    String surname;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, String surname, int salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public int tax() {
        if (this.salary < MIN_TAX_AMOUNT) {
            return 0;
        } else {
            return (int) (this.salary * (TAX_PERCENTAGE));
        }
    }

    public int bonus() {
        if (this.workHours > MAX_WORK_HOUR) {
            return (this.workHours - MAX_WORK_HOUR) * HOURLY_FEE;
        } else {
            return 0;
        }
    }

    public int raiseSalary() {
        if (CURRENT_YEAR - this.hireYear > 19) {
            return (int) (this.salary * (0.15));
        } else if (CURRENT_YEAR - this.hireYear > 9) {
            return (int) (this.salary * (0.10));
        } else {
            return (int) (this.salary * (0.05));
        }
    }

    public String toString() {
        String info = "Name: " + name + " \nSurname: " + surname + "\nSalary: " + salary + "\nWorkhours: " + workHours +
                "\nHire Year: " + hireYear + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nSalary Increment:" + (raiseSalary()) +
                "\nSalary with bonus and tax:" + (this.salary - tax() + bonus()) + "\nTotal new salary: " + (raiseSalary() + this.salary + bonus()) +
                "\nNet new salary: " + (this.salary + raiseSalary() + bonus() - tax());

        return info;

    }
}
