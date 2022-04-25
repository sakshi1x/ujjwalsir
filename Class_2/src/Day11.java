import java.util.Scanner;

public class Day11 {
    public static void main(String[] args)
    {
        int month;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
        month = sc.nextInt();
        System.out.println("year");
        int y= sc.nextInt();
        int b;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
           b =1;
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            b=2;
        }
        else if ( month == 2 )
        {
            if ((y%4==0 && y %100!=0)||(y%400==0)) {
                b = 3;
            }
            else {
                    b =4;
                }
        }
        else{
            b = 0;

    }
        switch (b){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("30");
                break;
            case 3:
                System.out.println("29");
                break;
            case 4:
                System.out.println("28");
                break;
            default:
                System.out.println("sorry");
                break;
        }
}

}
