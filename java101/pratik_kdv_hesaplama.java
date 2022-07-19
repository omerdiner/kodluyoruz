import java.util.Scanner;

public class pratik_kdv_hesaplama {
    public static void main(String[] args) {
        double amount, KDV_percantage, KDV_amount, amountWithKDV;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount:");
        amount = scanner.nextDouble();

        if (amount >= 1000) {
            KDV_percantage = 0.08;
        } else {
            KDV_percantage = 0.18;
        }

        KDV_amount = amount * KDV_percantage;
        amountWithKDV = amount + KDV_amount;

        System.out.println("Amount without KDV: " + amount);
        System.out.println("KDV percentage: " + KDV_percantage);
        System.out.println("KDV amount: " + KDV_amount);
        System.out.println("Amount with KDV: " + amountWithKDV);

    }
}
