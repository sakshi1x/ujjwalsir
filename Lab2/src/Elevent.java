import java.util.Scanner;

public class Elevent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = scanner.nextInt();
        System.out.println("enter the number : ");
        int b = scanner.nextInt();

        String d = (a < 50 && a < b) ? "true" : "false";
        System.out.println(d);
    }
}
