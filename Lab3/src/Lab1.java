import javax.swing.*;

public class Lab1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your marks in math");
        int math= Integer.parseInt(name);

        String a =JOptionPane.showInputDialog("enter your marks in science");
        int b= Integer.parseInt(a);

        String c =JOptionPane.showInputDialog("enter your marks in eng");
        int d= Integer.parseInt(c);

        String g =JOptionPane.showInputDialog("enter your marks in comp");
        int f= Integer.parseInt(g);

        int e= (math+b+d+f)/4;
        String grade=(e>=70)?"first class":(e<70 &&e>59)?"second class":(e<59&&e>49)?"third class":"fail";

        JOptionPane.showMessageDialog(null,grade);




        System.exit(0);


    }
}


