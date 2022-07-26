import java.util.Arrays;

public class pratik_duplicate {
    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] list = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8};
        int[] duplicatedEvenNumbers = new int[list.length / 2];
        Arrays.fill(duplicatedEvenNumbers, -1);
        int beginning = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0) {
                    if (!isFind(duplicatedEvenNumbers, list[i])) {
                        duplicatedEvenNumbers[beginning] = list[i];
                        beginning++;
                        break;
                    }
                }
            }
        }
        for (int i : duplicatedEvenNumbers) {
            if (i != -1) {
                System.out.print(i + " ");
            }


        }

    }
}
