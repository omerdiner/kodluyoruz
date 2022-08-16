package PolicyManagement.Address.Concrete;

import PolicyManagement.User.User;

import java.util.Scanner;

public class AddressManager {
    private static Scanner scanner = new Scanner(System.in);

    public static void addAddress(User user) {
        System.out.println("1.Home Address\n2.Business Adress\n3.Exit");
        int choice;
        do {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);

        String address;
        switch (choice) {
            case 1:
                System.out.println("Address: ");
                address = scanner.nextLine();
                user.getAddresses().add(new HomeAddress(address));
                break;
            case 2:
                System.out.println("Address: ");
                address = scanner.nextLine();
                user.getAddresses().add(new BusinessAddress(address));
                break;
            case 3:
                return;
        }
        System.out.println("Address added.");

    }

    public static void deleteAddress(User user) {
        int size = user.getAddresses().size();

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " : " + user.getAddresses().get(i).getAddress());
        }
        System.out.println("0. Exit");
        int choice;
        do {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
        } while (choice < 0 || choice >= size);

        if (choice == 0)
            return;

        user.getAddresses().remove(choice - 1);
        System.out.println("Addess deleted.");

    }
}
