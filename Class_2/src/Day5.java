import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scanner.nextInt();

        int c = (a % 5 == 0 && a % 11 == 0) ? 1 : 0;
        switch (c) {
            case 1:
                System.out.println("divisable");
            case 2:
                System.out.println("not");
        }
    }
}
