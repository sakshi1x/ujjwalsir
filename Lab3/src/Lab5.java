import javax.swing.*;

public class Lab5 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("enter the length of rectangle ");
        String b = JOptionPane.showInputDialog("enter the breath of rectangle ");
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e = c*d;
        JOptionPane.showMessageDialog(null,e);
        System.exit(0);
    }

}
