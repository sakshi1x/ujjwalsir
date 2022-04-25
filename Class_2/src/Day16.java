import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int e;
        System.out.println("enter sp");
        int a= scanner.nextInt();
        System.out.println("enter cp");
        int b = scanner.nextInt();
        int c= a-b;
        if (c>0){
             e= 1;
        }
        else {
             e= 0;
        }
        switch (e){
            case 1:
                System.out.println("profit");
            default:
                System.out.println("loss");

        }
    }
}
