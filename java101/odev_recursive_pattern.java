import java.util.Scanner;

public class odev_recursive_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("n: ");
        n = scanner.nextInt();
        pattern(n, n, false);
    }

    public static void pattern(int n, int tmp, boolean isReversed) {
        System.out.print(n+" ");
        if (n > 0) {
            if (!isReversed) {
                pattern(n - 5, tmp, false);
            } else {
                if (n + 5 > tmp)
                    return;
                else
                    pattern(n + 5, tmp, true);
            }
        } else {
            pattern(n + 5, tmp, true);
        }

    }
}
