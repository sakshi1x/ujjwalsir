import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the basic salary");
        double basic= scanner.nextDouble();
        double gross, da, hra;
        if(basic <= 10000)
        {
            da  = basic * 0.8;
            hra = basic * 0.2;

        }
        else if(basic <= 20000)
        {
            da  = basic * 0.9;
            hra = basic * 0.25;
        }
        else
        {
            da  = basic * 0.95;
            hra = basic * 0.3;
        }






    }
}
