import java.util.Scanner;

public class Lab18 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the cp ");
        int a = scanner.nextInt();
        System.out.println("enter the sp");
        int b= scanner.nextInt();
        switch (b-a){
            case 1:
                System.out.println("profit");
                break;
            default:
                System.out.println("loss");
        }
    }
}
