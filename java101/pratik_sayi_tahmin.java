import java.util.Random;
import java.util.Scanner;

public class pratik_sayi_tahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int remaining = (int) (Math.log(100) / Math.log(2)) + 1;
        int guess;
        boolean isWin = false;

        do {
            remaining--;
            System.out.print("Guess:");
            guess = scanner.nextInt();

            if (guess == number) {
                isWin = true;
            } else if (guess < number) {
                System.out.println("Try a bigger number! ");
            } else {
                System.out.println("Try a smaller number! ");
            }
        } while (remaining > 0 && !isWin);

        if (isWin) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Fail. The number was: "+number);
        }
    }
}
