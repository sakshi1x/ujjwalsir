import javax.swing.*;

public class Lab10 {
    public static void main(String[] args) {
        String c= JOptionPane.showInputDialog("enter first number");
        String d =JOptionPane.showInputDialog("enter the second number");
        int a =Integer.parseInt(c);
        int b= Integer.parseInt(d);
        String g = (a < 50 && a < b) ? "true" : "false";
        JOptionPane.showMessageDialog(null,g);
        System.exit(0);

    }
}
