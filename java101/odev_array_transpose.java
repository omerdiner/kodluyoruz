import java.util.Scanner;

public class odev_array_transpose {
    public static void main(String[] args) {
        int row, column;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Row count: ");
        row = scanner.nextInt();
        System.out.print("Column count: ");
        column = scanner.nextInt();

        int arr[][] = new int[row][column];
        int transpose[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println((i + 1) + " - " + (j + 1) + " .element: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
