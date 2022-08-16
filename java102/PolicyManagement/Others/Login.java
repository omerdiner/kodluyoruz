package PolicyManagement.Others;

import java.util.Scanner;

public class Login {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] logIn() {
        System.out.print("Mail: ");
        String mail = scanner.next();
        System.out.print("Password");
        String password = scanner.next();
        return new String[]{mail, password};

    }
}
