import java.util.Scanner;

public class odev_mukemmel_sayi {
    public static void main(String[] args) {
        int number, i = 1, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number:");
        number = scanner.nextInt();


        while (i < number) {
            if (number % i == 0) {
                total += i;
            }
            i++;
        }
        if (total == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

    }
}
