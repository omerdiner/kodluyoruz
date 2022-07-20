import java.util.Scanner;

public class pratik_hesap_mak_1 {
    public static void main(String[] args) {
        int n1, n2, choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        n1 = scanner.nextInt();

        System.out.println("Second Number: ");
        n2 = scanner.nextInt();

        System.out.println("1.( + )  2. ( - )  3. ( x )  4.  ( / ) ");

        System.out.println("Choice:");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " +( n1 + n2));
                break;

            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                    System.out.println(n1 + " / " + n2 + " = " +((double) n1 / n2));
                else
                    System.out.println("Error !");
                break;
            default:
                System.out.println("Wrong choice.");
        }

    }
}
