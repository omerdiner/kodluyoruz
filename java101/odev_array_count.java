import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class odev_array_count {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ".element: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --- > " + entry.getValue() + " times");
        }
    }


}
