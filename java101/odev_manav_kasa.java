import java.util.Scanner;

public class odev_manav_kasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total;
        double pear = 2.14,
                apple = 3.67,
                tomatoes = 1.11,
                banana = 0.95,
                eggplant = 5.00;

        System.out.println("How many kg of banana:");
        int bananaKG = scanner.nextInt();
        System.out.println("How many kg of pear:");
        int pearKG = scanner.nextInt();
        System.out.println("How many kg of tomatoe:");
        int tomatoesKG = scanner.nextInt();
        System.out.println("How many kg of apple:");
        int appleKG = scanner.nextInt();
        System.out.println("How many kg of eggplant:");
        int eggplantKG = scanner.nextInt();

        total = pear * pearKG + banana * bananaKG + tomatoes * tomatoesKG + apple * appleKG + eggplant * eggplantKG;

        System.out.println("Total amount: " + total);

    }
}
