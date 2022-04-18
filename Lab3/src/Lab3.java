import javax.swing.*;

public class Lab3 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog("enter the first number ");
        String b= JOptionPane.showInputDialog("enter the second number ");
        String c= JOptionPane.showInputDialog("enter the fourth number ");
        String d= JOptionPane.showInputDialog("enter the fourth number ");
        int e= Integer.parseInt(a);
        int f = Integer.parseInt(b);
        int g =Integer.parseInt(c);
        int h = Integer.parseInt(d);
        int i = e+f+g+h;
        JOptionPane.showMessageDialog(null,i);
        System.exit(0);
    }
}
