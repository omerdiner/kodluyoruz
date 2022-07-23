import java.util.Scanner;

public class odev_min_max {
    public static void main(String[] args) {
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " . number: ");
            int x = scanner.nextInt();

            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
