import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        int a = scanner.nextInt();
        int b = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) ? 1 : 0;
        switch (b) {
            case 1:
                System.out.println("leap year");
                break;
            default:
                System.out.println("not leap year");
        }

    }
}
