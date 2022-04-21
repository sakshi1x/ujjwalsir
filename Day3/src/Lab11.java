import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();
        if (a==1){
        System.out.println("sunday");
    } else if (a==2) {
            System.out.println("monday");
        } else if (a==3) {
            System.out.println("tuesday");


        } else if (a==4) {
            System.out.println("wednesday");

        } else if (a==5) {
            System.out.println("thrusday");

        } else if (a==6) {
            System.out.println("friday");

        }
        else {
            System.out.println("saturday");
        }

    }

    }
