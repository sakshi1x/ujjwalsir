import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        int a= scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println(a);

        } else if (b>a) {
            System.out.println(b);


        }
        else{
            System.out.println("equal");
        }

    }
}
