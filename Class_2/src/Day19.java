import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        if (a>=12){
            b=1;

        }
        else {
            b = 2;
        }
        switch (b){
            case 1:
                System.out.println("am");
            case 2:
                System.out.println("pm");
        }
    }
}
