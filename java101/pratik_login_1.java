import java.util.Scanner;

public class pratik_login_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = "name";
        String password = "qwerty";

        String userInputName, userInputPassword;

        System.out.println("Username: ");
        userInputName = scanner.nextLine();

        System.out.println("Password: ");
        userInputPassword = scanner.nextLine();

        if (userInputName.equals(userName)) {
            if (userInputPassword.equals(password)) {
                System.out.println("Logged in!");
            } else {
                System.out.println("Wrong password!");
                System.out.println("Do you want to change your password? (1.Yes 0.No) :");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    System.out.println("Enter your new password: ");
                    String tmpPassword = scanner.nextLine();
                    if (tmpPassword.equals(password)) {
                        System.out.println("Your new password cannot be the same as your old password.");
                    } else {
                        password = tmpPassword;
                        System.out.println("Your password has changed.");
                    }
                } else {
                    System.out.println("You chose not to create a password.");
                }
            }
        } else {
            System.out.println("Wrong username!");
        }

    }
}
