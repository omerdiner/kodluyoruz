import java.util.Scanner;

public class odev_fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 1;
        int second = 1;
        int tmp;

        System.out.print("n:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            tmp = first + second;
            first = second;
            second = tmp;
        }
    }
}
