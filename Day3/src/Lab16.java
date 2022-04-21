import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the first side of triangle");

        int a= scanner.nextInt();
        System.out.println("enter the first side of triangle");

        int b= scanner.nextInt();
        System.out.println("enter the first side of triangle");

        int c= scanner.nextInt();
        boolean b1 =( a == c )||(a==b )||(b==c );
        if (a==b && b==c && a==c){
            System.out.println("equi");
        } else if (b1){
            System.out.println("iso");

        }
        else {
            System.out.println("scalen");
        }
    }
}
