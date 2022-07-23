import java.util.Scanner;

public class pratik_atm {
    public static void main(String[] args) {
        String userName, password;
        int choice;
        int remainder = 3;
        int balance = 1500;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (remainder > 0 && !exit) {

            System.out.print("Username : ");
            userName = scanner.nextLine();
            System.out.print("Password : ");
            password = scanner.nextLine();
            if ((userName.equals("patika") && password.equals("dev"))) {
                System.out.println("Welcome to Kodluyoruz Bank.");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please choose the action you want to do : ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Amount You Want to Deposit : ");
                            int amount = scanner.nextInt();
                            balance += amount;
                            System.out.println("Your Current Balance : " + balance + " tl");
                            break;
                        case 2:
                            System.out.print("Amount You Want To Withdraw : ");
                            amount = scanner.nextInt();
                            if (amount > balance) {
                                System.out.println("Insufficient Balance.");
                            } else {
                                balance -= amount;
                                System.out.println("Current Balance : " + balance + " tl");
                            }
                            break;
                        case 3:
                            System.out.println("Current Balance : " + balance + "tl");
                            break;

                        case 4:
                            System.out.println("Exiting");
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } while (choice != 4);


            } else {
                remainder--;
                System.out.print("Incorrect entry. ");
                System.out.println("Remaining right : " + remainder);
            }
            if (remainder == 0)
                System.out.print("Your card has been blocked.");
        }
    }
}
