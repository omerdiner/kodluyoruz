import java.util.Scanner;

public class pratik_sinif_gecme {
    public static void main(String[] args) {
        int math, music, turkish, chemistry, physics;
        int count = 0;
        double total = 0, average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Math grade: ");
        math = scanner.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            count++;
        }
        System.out.print("Music grade: ");
        music = scanner.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            count++;
        }
        System.out.print("Turkish grade: ");
        turkish = scanner.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            count++;
        }
        System.out.print("Chemistry grade: ");
        chemistry = scanner.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            count++;
        }
        System.out.print("Physics grade: ");
        physics = scanner.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            count++;
        }

        average = total / count;

        if (average >= 55) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("You failed the class!");
        }

        System.out.println("Grade point average: " + average);
    }
}
