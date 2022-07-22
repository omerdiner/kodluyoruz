import java.util.Scanner;

public class pratik_uslu_sayi {
    public static void main(String[] args) {
        int base , pow;
        int total=1;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Base :");
        base=scanner.nextInt();

        System.out.println("Power :");
        pow=scanner.nextInt();

        for(int i=1;i<=pow;i++){
            total*=base;
        }

        System.out.println(total);
    }
}
