import java.util.Scanner;

public class pratik_etkinlik_onerme {
    public static void main(String[] args) {
        int temperature;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature :");
        temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("You can ski!");
        }
        if (temperature > 5 && temperature < 15) {
            System.out.println("You can go to the cinema.");
        }
        if (temperature > 10 && temperature < 25) {
            System.out.println("You can go on a picnic.");
        }
        if (temperature > 25) {
            System.out.println("You can go swimming.");
        }
    }
}
