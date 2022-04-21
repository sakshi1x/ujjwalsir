import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int a= scanner.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisable");
        }
    }
}
