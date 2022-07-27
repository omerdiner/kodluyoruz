package MineSweeper;

import java.util.Scanner;

public class MineSweeper {
    final Scanner scanner = new Scanner(System.in);
    final int row;
    final int column;
    final int MINE_COUNT;
    char[][] table;
    boolean[][] checkTable;
    char[][] gameTable;
    boolean checkGameOver;


    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        MINE_COUNT = (row * column) / 4;
        table = new char[row][column];
        gameTable = new char[row][column];
        checkTable = new boolean[row][column];
        checkGameOver = false;
    }


    public void run() {
        placeMines();
        initializeTables();
        printTable();

        while (!isWin() && !checkGameOver) {
            takeGuess();
        }
        if (isWin()) {
            System.out.println("-- CONGRATULATIONS! --");
        }
    }

    public void takeGuess() {
        int x, y;
        do {
            System.out.print("x: ");
            x = scanner.nextInt();
            System.out.print("y: ");
            y = scanner.nextInt();
            x--;
            y--;
        } while (!checkIsValidXY(x, y));

        checkTable[x][y] = true;

        if (table[x][y] == 'x') {
            checkGameOver = true;
            System.out.println("-- GAME OVER! You chose the mine. --");
            printActualTable();
        } else {
            gameTable[x][y] = Character.forDigit(checkAround(x, y), 10);
            printTable();
        }

    }

    public boolean checkIsOpen(int x, int y) {
        if (checkTable[x][y] && table[x][y] != 'x') {
            System.out.println("Already opened!");
            return true;
        }

        return false;
    }

    public boolean checkIsValidXY(int x, int y) {
        if ((x >= 0 && x < this.row) && (y >= 0 && y < this.column)) {
            return !checkIsOpen(x, y);
        } else {
            System.out.println("Invalid input!");
            return false;
        }
    }

    public int checkAround(int inputRow, int inputColumn) {
        int total = 0;
        int[] x = {-1, 0, 1};
        int[] y = {-1, 0, 1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                if ((inputRow + x[i] < this.row && inputRow + x[i] >= 0) && (inputColumn + y[j] < this.column && inputColumn + y[j] >= 0)) {
                    if (table[inputRow + x[i]][inputColumn + y[j]] == 'x') {
                        total++;
                    }
                }
            }
        }
        return total;
    }

    public void printTable() {
        for (int i = 0; i < (column * 4); i++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == 0)
                    System.out.print(" | " + gameTable[i][j] + " ");
                else if (j == column - 1)
                    System.out.print(" " + gameTable[i][j] + " | ");
                else
                    System.out.print(" " + gameTable[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < (column * 4); i++)
            System.out.print("-");
        System.out.println();
    }

    public void printActualTable() {
        for (int i = 0; i < (column * 4); i++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == 0)
                    System.out.print(" | " + table[i][j] + " ");
                else if (j == column - 1)
                    System.out.print(" " + table[i][j] + " | ");
                else
                    System.out.print(" " + table[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < (column * 4); i++)
            System.out.print("-");
        System.out.println();
    }

    public boolean isWin() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (!checkTable[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void initializeTables() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = '-';
                gameTable[i][j] = '-';
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                checkTable[i][j] = false;
            }
        }

        placeMines();

    }

    public void placeMines() {
        int x, y;
        int count = 0;
        while (true) {
            x = (int) (Math.random() * (row));
            y = (int) (Math.random() * (column));

            if (!checkTable[x][y]) {
                checkTable[x][y] = true;
                table[x][y] = 'x';
                count++;

                if (count == MINE_COUNT) {
                    break;
                }
            }
        }
    }

}
