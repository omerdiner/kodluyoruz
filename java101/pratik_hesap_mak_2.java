import java.util.Scanner;

public class pratik_hesap_mak_2 {
    static void plus() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }


    static void subtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);

    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor as 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);

    }

    static void power() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base value : ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent value : ");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);

    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);

    }

    static void modeRetrieval() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1:  :");
        int n1 = scanner.nextInt();
        System.out.print("Number 2 :");
        int n2 = scanner.nextInt();

        int result = n1 % n2;
        System.out.println("Result : " + result);

    }

    static void rectangularAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Long edge :");
        int longEdge = scanner.nextInt();
        System.out.print("Short edge :");
        int shortEdge = scanner.nextInt();

        int area, perimeter;
        area = longEdge * shortEdge;
        perimeter = (longEdge + shortEdge) * 2;

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- EXIT\n";

        do {
            System.out.print(menu);
            System.out.print("Choice : ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modeRetrieval();
                    break;
                case 8:
                    rectangularAreaAndPerimeter();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
                    break;
            }
        } while (select != 0);


    }
}
