package PatikaStore;

import java.util.Scanner;

public class AdminPanel {
    private Scanner scanner = new Scanner(System.in);
    private Phone phones = new Phone();
    private Notebook notebooks = new Notebook();

    public void start() {

        System.out.println("PatikaStore Product Management Panel !");
        boolean isContinue = true;

        while (isContinue) {
            switch (menu()) {
                case 1:
                    notebooks.productOperations();
                    break;
                case 2:
                    phones.productOperations();
                    break;
                case 3:
                    Brand.showBrandList();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    isContinue = false;
            }
        }
    }

    private int menu() {
        System.out.println("1 - Notebook Operations\n" +
                "2 - Mobile Phone Operationss\n" +
                "3 - List Brands\n" +
                "0 - Sign Out");

        int choice;
        do {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
        } while (choice > 3 || choice < 0);

        return choice;
    }
}
