import java.util.Arrays;
import java.util.Scanner;

public class pratik_min_max {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n:");
        n = scanner.nextInt();
        int smaller = 0, bigger = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                smaller = arr[i];

            } else if (arr[i] > n) {
                bigger = arr[i];
                break;
            }
        }

        System.out.println("Small: " + smaller);
        System.out.println("Big: " + bigger);
    }
}
