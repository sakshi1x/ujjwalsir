import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a first angle of triangle");
        int a = scanner.nextInt();
        System.out.println("enter a second angle of triangle");
        int b= scanner.nextInt();
        System.out.println("enter a third angle of triagle");
        int c= scanner.nextInt();
        int d = a+b+c;
        if (d==360){
            System.out.println("valid");
        }
        else {
            System.out.println("not valid");
        }
    }
}
