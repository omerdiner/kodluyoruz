import java.util.Scanner;

public class pratik_armstrong_1 {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("n:");
        n=scanner.nextInt();

        while (n > 0) {
            total += n % 10;
            n /= 10;
        }

        System.out.println(total);
    }
}
