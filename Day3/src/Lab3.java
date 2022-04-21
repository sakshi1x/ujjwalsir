import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scanner.nextInt();
        if (a > 1) {
            System.out.println("positive");

        } else if (1 < a) {
            System.out.println("negative");


        } else {
            System.out.println("zero");

        }
    }


}

