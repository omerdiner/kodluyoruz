package inheritance_practice;

public class SecurityGuard extends Officer {
    public String certificate;

    public SecurityGuard(String name, String surname, String phoneNumber, String mailAdress, String department, String workTime, String certificate) {
        super(name, surname, phoneNumber, mailAdress, department, workTime);
        this.certificate = certificate;
    }

    public void watch() {
        System.out.println("Guard " + this.getName() + " is on duty.");
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

}
