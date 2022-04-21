import java.util.Scanner;

public class Lab19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks on sub 1");
        int a = scanner.nextInt();
        System.out.println("enter the marks on sub 2");
        int b = scanner.nextInt();
        System.out.println("enter the marks on sub 3");
        int c = scanner.nextInt();
        System.out.println("enter the marks on sub 4");
        int d = scanner.nextInt();
        int e = (a + b + c + d) / 4;
        switch (e) {
            case (90):
                System.out.println("first  ");
            case (80):
                System.out.println("sec");
            case (70):
                System.out.println("third");
            case (60):
                System.out.println("forth");
            case (50):
                System.out.println("six");
            default:
                System.out.println("fail");
        }
    }
}