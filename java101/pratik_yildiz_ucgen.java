import java.util.Scanner;

public class pratik_yildiz_ucgen {
    public static void main(String[] args) {
        int n, i, j, space = 1;
        Scanner s = new Scanner(System.in);

        System.out.print("Number of rows: ");
        n = s.nextInt();

        space = n - 1;

        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }

        space = 1;

        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }

            space++;
            System.out.println();
        }

    }
}
