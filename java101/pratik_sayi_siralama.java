import java.util.Scanner;

public class pratik_sayi_siralama {
    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("A:");
        number1 = scanner.nextInt();
        System.out.print("B:");
        number2 = scanner.nextInt();
        System.out.print("C:");
        number3 = scanner.nextInt();


        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println(number1 + " < " + number2 + " < " + number3);
            } else {
                System.out.println(number1 + " < " + number3 + " < " + number2);
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println(number2 + " < " + number1 + " <" + number3);
            } else {
                System.out.println(number2 + " < " + number3 + " < " + number1);
            }
        } else {
            if (number1 < number2) {
                System.out.println(number3 + " < " + number1 + " < " + number2);
            } else {
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }
        }
    }
}
