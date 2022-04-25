import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a charector");
        String a= scanner.nextLine();
        int c=0;

        boolean b1 = (a==a)||(a == "e") || (a == "i") || (a == "o") || (a == "u");
        if (b1){
            c+=1;


        }
        else {
           c+=2;
        }
        switch (c){
            case 1:
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonent");
        }
    }
}