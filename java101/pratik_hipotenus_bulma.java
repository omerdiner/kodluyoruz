import java.util.Scanner;

public class pratik_hipotenus_bulma {
    public static void main(String[] args) {
        int a, b, c;
        double u, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Side 1: ");
        a = scanner.nextInt();

        System.out.println("Side 2: ");
        b = scanner.nextInt();

        System.out.println("Side 3: ");
        c = scanner.nextInt();

        u = (a + b + c) / 2.0;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println(area);
    }
}
