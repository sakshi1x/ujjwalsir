import java.util.Scanner;

public class Day18 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int units=280;
        int a;

        double billpay;

        if(units>100)
        {
            billpay=units*1.20;
            a=1;

        }
        else if(units<300)
        {
            billpay=100*1.20+(units-100)*2;
            a =2;
        }
        else if(units>300)
        {
            billpay=100*1.20+200*2+(units-300)*3;
            a=3;
        }
        else{
            a=0;
            billpay=0;
        }


        switch (a){
            case 1:
                System.out.println("Bill to pay : " + billpay);
            case 2:
                System.out.println("Bill to pay : " + billpay);
            case 3:
                System.out.println("Bill to pay : " + billpay);
            default:
                System.out.println("Bill to pay : " );
    }

}

}

