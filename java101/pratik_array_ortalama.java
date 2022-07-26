import java.util.Arrays;

public class pratik_array_ortalama {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 50)];
        double sum = 0, avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }

        for (int i : arr) {
            sum += 1.0 / i;
        }

        avg = arr.length / sum;
        
        System.out.println(Arrays.toString(arr));
        System.out.println(avg);

    }
}
