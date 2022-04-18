import javax.swing.*;

public class Lab9 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("enter first number ");
        String b = JOptionPane.showInputDialog("enter second number ");
        String c =JOptionPane.showInputDialog("enter third number ");
        int d =Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);
        String g = (d == e || e == f || f == d) ? "equal" : "not equal";
        JOptionPane.showMessageDialog(null,g);
        System.exit(0);

    }
}
