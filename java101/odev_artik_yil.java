import java.util.Scanner;

public class odev_artik_yil {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year:");
        year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap year!");
            } else {
                System.out.println("Not a leap year!");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap year!");
            } else {
                System.out.println("Not a leap year!");
            }
        }
    }
}
