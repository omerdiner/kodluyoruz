import java.util.Scanner;

public class pratik_daire_alan_cevre {
    public static void main(String[] args) {
        double r, a, area;
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        r = scanner.nextDouble();

        System.out.println("Angle :");
        a = scanner.nextDouble();

        area = (PI * (r * r) * a) / 360.0;

        System.out.println(area);


    }
}
