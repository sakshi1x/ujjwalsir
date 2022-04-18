import javax.swing.*;

public class Lab4 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog("enter the first number ");
        String b=JOptionPane.showInputDialog("enter the second number ");
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e= c+d;
        int f=c*d;
        int g= e/f;
        JOptionPane.showMessageDialog(null,"sum="+e);
        JOptionPane.showMessageDialog(null, "product = "+f);
        JOptionPane.showMessageDialog(null, "divide= "+g);
        System.exit(0);
    }
}
