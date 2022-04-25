import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch = sc.next().charAt(0);
        int b = (Character.isUpperCase(ch)) ? 1 : 0;
        switch (b) {
            case 1:
                System.out.println("upper");
                break;
            default:
                System.out.println("not");
        }


    }
}