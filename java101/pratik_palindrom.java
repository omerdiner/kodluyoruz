import java.util.Scanner;

public class pratik_palindrom {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        n= scanner.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println("Not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int n) {
        int tmp = n, lastDigit, reversed = 0;

        while (tmp != 0) {
            lastDigit = tmp % 10;
            tmp /= 10;
            reversed = (reversed * 10) + lastDigit;
        }

        return reversed == n;
    }
}
