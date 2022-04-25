import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
        System.out.println("enter the number");
        int a = scanner.nextInt();
        System.out.println("enter the number");
        int b =  scanner.nextInt();

        int  d = ((a>b )?1:(b>a )?2:0);
        switch (d){
            case (1) :
                System.out.println("a is greater");
                break;
            case (2):
                System.out.println("b is greater");
                break;

            default:
                System.out.println("all are equal");
        }
    }
}
