import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the charecter ");
        char a= (char) scanner.nextInt();
        if (Character.isAlphabetic(a)){
            System.out.println("alphabet");

        }
        else{
            System.out.println("not alphabet");
        }
    }
}
