import java.util.Scanner;

public class pratik_faktoriyel {
    public static void main(String[] args) {
        int n, r;
        int N, R, NR;
        int x = 1;
        int C;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.print("r: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        N = x;

        x = 1;

        for (int i = 1; i <= r; i++) {
            x *= i;
        }
        R = x;

        x = 1;

        for (int i = 1; i <= n - r; i++) {
            x *= i;
        }
        NR = x;

        C = N / (R * NR);

        System.out.println(C);
    }
}
