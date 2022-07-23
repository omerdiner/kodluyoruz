import java.util.Scanner;

public class odev_ters_ucgen {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * n - 1; j >= 2 * i + 1; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
