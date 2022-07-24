import java.util.Scanner;

public class pratik_fibo_recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + ". element of fibonacci serie: " + fibo(n));
    }

    public static int fibo(int n) {
        if (n > 2) {
            return fibo(n - 1) + fibo(n - 2);
        } else {
            return 1;
        }
    }
}
