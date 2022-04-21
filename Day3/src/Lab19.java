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
        int e = (int) ((a + b + c + d) / 4);
        System.out.println(e);
        if (e>=90 ){
            System.out.println("first");



        } else if (e>=80 && e<90) {
            System.out.println("second");

        } else if (e>=70 && e<80) {
            System.out.println("third");

        } else if (e>=60 && e<50) {
            System.out.println("fourth");

        }
        else {
            System.out.println("fail");
        }
    }
}