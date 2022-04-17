import com.sun.jdi.DoubleValue;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of a rectangle : ");
        double l= scanner.nextDouble();

        System.out.println("enter the breath of a rectangle : ");
        double b= scanner.nextDouble();
        int a = (int)l;
        int c =(int)b;
        int area=a*c;
        System.out.println(area);





    }
}
