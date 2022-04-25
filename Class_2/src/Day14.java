import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first angle of a triangle");
        int a = scanner.nextInt();
        System.out.println("enter the second angle ");
        int b = scanner.nextInt();
        System.out.println("third angle ");
        int c=scanner.nextInt();
        int d;
        if (a==b && a==c && c==b){
            d=1;
        } else if( (a==b && a==c)||(c==b && c==a)||(b==a && b==c) ){
            d = 2;


        }
        else {
            d=0;
        }
        switch (d){
            case 1:
                System.out.println("equilateral");
            case 2:
                System.out.println("iso");
            default:
                System.out.println("scal");
        }

    }
}
