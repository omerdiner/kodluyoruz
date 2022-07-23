public class odev_asal_sayi {
    public static void main(String[] args) {
        boolean isPrime;
        System.out.print("2 ");
        for (int i = 3; i < 100; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
        }
    }
}
