import java.util.Scanner;

public class odev_recursive_power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exp;

        System.out.print("Base: ");
        base = scanner.nextInt();
        System.out.print("Exponent: ");
        exp = scanner.nextInt();

        System.out.println(pow(base, exp));
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }
}
