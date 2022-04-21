import java.util.Scanner;

public class Lab15 {
    // Function to calculate for validity


    // Driver function
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the first side of triangle");

        int a= scanner.nextInt();
        System.out.println("enter the first side of triangle");

        int b= scanner.nextInt();
        System.out.println("enter the first side of triangle");

        int c= scanner.nextInt();
        boolean b1= (a + b <= c) ||( a + c <= b) ||( b + c <= a);

        if (b1) {
            System.out.print("Valid");
        }
        else{
            System.out.print("Invalid");
    }
}
}
