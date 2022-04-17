import java.util.Scanner;

public class Third {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your sub1 marks : ");
        int a=scanner.nextInt();
        System.out.println("enter your sub2 marks : ");
        int b=scanner.nextInt();
        System.out.println("enter your sub3 marks : ");
        int c=scanner.nextInt();
        System.out.println("enter your sub4 marks : ");
        int d=scanner.nextInt();
        int e=(a+b+c+d)/4;
        System.out.println(e+"%");
        String grade=(e>=70)?"first class":(e<70 &&e>59)?"second class":(e<59&&e>49)?"third class":"fail";
        System.out.println(grade);


    }
}
