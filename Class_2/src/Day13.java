import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first side of a triangle");
        int a = scanner.nextInt();
        System.out.println("enter the second side ");
        int b = scanner.nextInt();
        System.out.println("third side ");

        int c=scanner.nextInt();
        int d;
        if ((a+b>=c)||(b+c>=a)||(a+c>=b)){
            d =1;


        }
        else{
            d=0;
        }

        switch (d){
            case 1:
                System.out.println("triangle");
            case 2:
                System.out.println("not triangle");


        }

        }

}
