import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a charector");
        String a= scanner.nextLine();

        boolean b1 = (a == "e") || (a == "i") || (a == "o") || (a == "u");
        if (b1){
            System.out.println("vowel");


        }
        else {
            System.out.println("consonents");
        }
    }
}

