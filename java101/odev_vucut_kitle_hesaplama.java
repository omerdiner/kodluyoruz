import java.util.Scanner;

public class odev_vucut_kitle_hesaplama {
    public static void main(String[] args) {
        double height, bmIndex;
        int kg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height: ");
        height = scanner.nextDouble();

        System.out.println("Enter your kg: ");
        kg = scanner.nextInt();

        bmIndex = kg / (height * height);

        System.out.println("Your body mass index:" + bmIndex);

    }
}
