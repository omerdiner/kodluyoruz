import java.util.Scanner;

public class pratik_palindrom_string {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
