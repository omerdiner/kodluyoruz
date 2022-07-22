import java.util.Scanner;

public class pratik_two_power {
    public static void main(String[] args) {
        int n;
        int i=1;
        Scanner scanner=new Scanner(System.in);

        System.out.print("N:");
        n=scanner.nextInt();

        while(i<=n){
            System.out.println(i);
            i*=4;
        }

        i=1;

        System.out.println();

        while(i<=n){
            System.out.println(i);
            i*=5;
        }
    }
}
