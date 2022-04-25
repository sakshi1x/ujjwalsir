import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
        System.out.println("enter the number");
        int a = scanner.nextInt();
        System.out.println("enter the number");
        int b =  scanner.nextInt();
        System.out.println("enter the number");
        int c =  scanner.nextInt();
        int  d = ((a>b && a>c)?1:(b>a && b>c)?2:(c>a && c>b)?3:0);
        switch (d){
            case (1) :
                System.out.println("a is greater");
                break;
            case (2):
                System.out.println("b is greater");
                break;
            case (3):
                System.out.println("c is greater");
                break;
            default:
                System.out.println("all are equal");
        }
    }
}
