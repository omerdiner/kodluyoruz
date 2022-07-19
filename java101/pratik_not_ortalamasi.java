import java.util.Scanner;

public class pratik_not_ortalamasi {
    public static void main(String[] args) {

        int math, music, history, bio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Math grade: ");
        math = scanner.nextInt();

        System.out.println("History grade: ");
        history = scanner.nextInt();

        System.out.println("Bio grade: ");
        bio = scanner.nextInt();

        System.out.println("Music grade: ");
        music = scanner.nextInt();

        double average = (math + history + bio + music) / 4.0;

        System.out.println(average);
        String info = (average >= 60) ? "Passed" : "Failed";

        System.out.println(info);


    }
}
