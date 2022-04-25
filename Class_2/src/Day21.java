import java.util.Scanner;

import static java.util.logging.Logger.global;

public class Day21 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("enter sec number");
        int b = scanner.nextInt();
        int c;
        int temp = 0;
        if (a==b){
            c= 1;

        }
        else{
            c=0;
        }
        switch (c){
            case 1:
                System.out.println("equal");
                break;
            case 0:
                b =temp;
                b = a;
                a= temp;
                System.out.println(  b );
                System.out.println(  a );
                break;
            default:
                System.out.println("helloss");

        }
    }
}
