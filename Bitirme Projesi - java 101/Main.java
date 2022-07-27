package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.print("Row count: ");
        row = scanner.nextInt();
        System.out.print("Column count: ");
        column = scanner.nextInt();

        MineSweeper game = new MineSweeper(row, column);
        game.run();
    }

}
