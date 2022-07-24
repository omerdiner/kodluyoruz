import java.util.Scanner;

public class odev_recursive_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.println(isPrime(n, 2));
    }

    public static boolean isPrime(int n, int x) {
        if (x == n) {
            return true;
        }
        if (n % x == 0) {
            return false;
        } else {
            return isPrime(n, x + 1);
        }
    }
}
