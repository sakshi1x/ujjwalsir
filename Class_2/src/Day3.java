import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your marks in sub 1");
        int a = scanner.nextInt();
        System.out.println("enter your marks in sub 2");
        int b =scanner.nextInt();
        System.out.println("enter your marks in sub 3");
        int c =scanner.nextInt();
        System.out.println("enter your marks in sub 4");
        int d = scanner.nextInt();
        System.out.println("enter your marks in sub 5");
        int e =scanner.nextInt();
        int f =(a+b+c+d+e)/5;
        int g = (f>=90)?1:(f<90 && f>=80)?2:(f<80 && f>=70)?3:(f<70&&f>=60)?4:5;
        switch (g){
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            case 4:
                System.out.println("fourth");
                break;
            default:
                System.out.println("fail");

        }

    }

}
