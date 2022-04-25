import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first angle of a triangle");
        int a = scanner.nextInt();
        System.out.println("enter the second angle ");
        int b = scanner.nextInt();
        System.out.println("third angle ");
        int c=scanner.nextInt();
        int d =a+b+c;
        int r = (d==180)?1:0;
        switch (r){
            case 1:
                System.out.println("triangle");
                break;

            default:
                System.out.println("sorry");
        }

    }
}
