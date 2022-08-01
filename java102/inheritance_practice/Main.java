package inheritance_practice;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ali", "Tek", "5504447785", "ali@gmail.com");

        Academician academician = new Academician("Veli", "Net", "5784562178", "veli@yildiz.edu.tr", "CE", "Associate Professor");

        Officer officer = new Officer("Halil", "Cift", "5304447785", "halil@gmail.com", "Cleaning", "09.00-17.00");

        Lecturer lecturer = new Lecturer("Eda", "Yilmaz", "5404546785", "eda@yildiz.edu.tr", "IE", "Lecturer", "A102");

        Assistant assistant = new Assistant("Metin", "Kay", "5204534655", "metin@yildiz.edu.tr", "CE", "Assistant", "12.00-13.00");

        LabAssistant labAssistant = new LabAssistant("Ece", "On", "5404545661", "ece@yildiz.edu.tr", "IE", "Assistant", "15.00-18.00");

        It it = new It("Omer", "Diner", "5404432785", "omer@gmail.com", "IT", "10.00-17.30", "Siber Security");

        SecurityGuard securityGuard = new SecurityGuard("Hakan", "Meta", "5384576785", "hakan@yildiz.edu.tr", "Security", "08.00-16.00", "TSK");

        System.out.println(worker.toString());
        worker.eatLunch();
        System.out.println();

        officer.eatLunch();
        System.out.println();

        System.out.println(academician.toString());
        academician.entry();
        academician.attendClass();
        System.out.println();

        securityGuard.watch();
        System.out.println();

        labAssistant.entry();
        System.out.println(labAssistant.toString());
        labAssistant.makeLabWork();
        labAssistant.exit();

    }


}
