import java.util.Scanner;

public class odev_ucak_bileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance, age, type;
        double amount;

        System.out.print("Distance:");
        distance = scanner.nextInt();
        System.out.print("Age:");
        age = scanner.nextInt();
        System.out.print("One way or two way  (Press 1 or 2): ");
        type = scanner.nextInt();

        if (age < 0 || distance < 0 || !(type == 1 || type == 2)) {
            System.out.println("ERROR!");
            return;
        }

        amount = distance * 0.1;

        if (type == 2) {
            amount *= 2;
            amount *= 0.8;
        }

        if (age < 12) {
            amount *= 0.5;
        } else if (age < 24) {
            amount *= 0.9;
        } else if (age > 65) {
            amount *= 0.7;
        }

        System.out.println("Total amount: " + amount);

    }
}
