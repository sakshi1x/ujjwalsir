import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("number");
        int a = scanner.nextInt();
        int b;
        if (a%2==0){
            b = 1;

        }
        else {
            b=0;
        }
        switch (b){
            case 1:
                System.out.println("even");
            default:
                System.out.println("odd ");
        }
    }
}
