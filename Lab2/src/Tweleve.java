import java.util.Scanner;

public class Tweleve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of sqaure : ");
        int l = scanner.nextInt();
        int s = l * l;
        System.out.println(s);
        int p =4*l;
        System.out.println(p);
        System.out.println("enter the principle : ");
        int principle = scanner.nextInt();
        System.out.println("enter rate:  ");
        int r = scanner.nextInt();
        System.out.println("enter the time ");
        int t = scanner.nextInt();
        int si=(principle*r*t)/100;
        System.out.println(si);
        System.out.println("enter the length of tiangle : ");
        int length = scanner.nextInt();
        System.out.println("enter the breath of tringle : ");
        int breath = scanner.nextInt();
        System.out.println("enter the height of triangle : ");
        int height= scanner.nextInt();
        int a=(length*breath*height)/2;
        System.out.println(a);
        System.out.println("enter the length of cuboid : ");
        int b = scanner.nextInt();
        System.out.println("enter the length of cuboid : ");
        int c = scanner.nextInt();
        System.out.println("enter the length of cuboid : ");
        int d = scanner.nextInt();
        int v1= b*c*d;
        System.out.println(v1);
        System.out.println("enter the length of cube : ");
        int f = scanner.nextInt();
        int v2= f*f*f;
        System.out.println(v2);













    }
}
