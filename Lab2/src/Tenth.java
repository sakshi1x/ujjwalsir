import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = scanner.nextInt();
        System.out.println("enter the number : ");
        int b = scanner.nextInt();
        System.out.println("enter the number : ");
        int c = scanner.nextInt();
        String d = (a == b || b == c || a == c) ? "equal" : "not equal";
        System.out.println(d);


    }
}