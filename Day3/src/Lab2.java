import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        int a= scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        System.out.println("enter third number");
        int c= scanner.nextInt();
        if (a>b && a>c){
            System.out.println(a);

        } else if (b>a && b>c) {
            System.out.println(b);


        } else if (c>a && c>b) {
            System.out.println(c);

        }
        else
        {
            System.out.println("equal");
        }

    }

}
