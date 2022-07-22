import java.util.Scanner;

public class pratik_harmonic {
    public static void main(String[] args) {
        double h = 0;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("n:");
        n = scanner.nextInt();

        for (double i = 1; i <= n; i++) {
            h += (1 / i);
        }

        System.out.println(h);

    }
}
