import java.util.Scanner;

public class Second {
    public static void main (String [] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = scanner.nextInt();
        System.out.println("enter second number : ");
        int b = scanner.nextInt();
        System.out.println("enter third number : ");
        int c = scanner.nextInt();
        System.out.println("enter fourth number : ");
        int d = scanner.nextInt();
        int sum = a+b+c+d;
        System.out.println(sum);

    }

}
