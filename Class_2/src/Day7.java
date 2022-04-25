import java.util.Scanner;

public class Day7 {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch=sc.next().charAt(0);
        int b =0;



       if (Character.isAlphabetic(ch)){
           b+=1;

       }
       else{
           b+=0;
       }
       switch (b){
           case 1:
               System.out.println("alpha");
               break;
           default:
               System.out.println("not");
       }
    }
}
