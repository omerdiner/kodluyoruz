import java.util.Arrays;
import java.util.Scanner;

public class odev_array_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n:");
        n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
