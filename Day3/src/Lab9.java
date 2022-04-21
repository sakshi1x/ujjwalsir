import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a charector");
        char a= (char) scanner.nextInt();
        if (Character.isAlphabetic(a)){
            System.out.println("alphabet");
        } else if (Character.isDigit(a)) {
            System.out.println("digit");

        }
        else {
            System.out.println("speacial charector");
        }
    }
}
