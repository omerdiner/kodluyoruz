import java.util.Scanner;

public class pratik_ebob_ekok {
    public static void main(String[] args) {
        int number1, number2, small, big, tmp;
        int ebob = 0, ekok = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1 : ");
        number1 = scanner.nextInt();

        System.out.print("Number2 : ");
        number2 = scanner.nextInt();

        if (number1 > number2) {
            small = number2;
            big = number1;
        } else {
            big = number2;
            small = number1;
        }

        tmp = small;
        while (tmp > 0) {
            if ((number1 % tmp == 0) && (number2 % tmp == 0)) {
                ebob = tmp;

                break;
            }
            tmp--;
        }

        tmp = big;
        while (true) {
            if ((tmp % number1 == 0) && (tmp % number2 == 0)) {
                ekok = tmp;
                break;
            }
            tmp++;
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
