import java.util.Scanner;

public class pratik_cift_sayi_toplam {
    public static void main(String[] args) {
        int n, count = 0;
        double sum = 0, avg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number :");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                count++;
                sum += i;
            }
        }

        avg = sum / count;

        System.out.println(avg);
    }
}
