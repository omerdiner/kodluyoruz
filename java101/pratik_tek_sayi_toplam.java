import java.util.Scanner;

public class pratik_tek_sayi_toplam {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("N:");
            n = scanner.nextInt();

            if (n % 4 == 0) {
                sum += n;
            }

        } while (n % 2 == 0);

        System.out.println(sum);
    }
}
