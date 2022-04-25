import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int a =scanner.nextInt();
        int b;
        int c;
        if (a>0){
            b =1;
        }
        else
        {
            b=0;

        }
        switch (b){
            case 1:
                Math math = null;
                System.out.println(-a);
                break;
            case 2:
                System.out.println(Math.abs(a));
            default:
                System.out.println("0");

        }

    }
}
