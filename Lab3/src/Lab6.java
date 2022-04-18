import javax.swing.*;

public class Lab6 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog("enter your name ");
        String b = JOptionPane.showInputDialog("enter your address ");
        String c= JOptionPane.showInputDialog("enter your interest ");
        JOptionPane.showMessageDialog(null, "your name is "+a+" your address is "+b+" your interest is  "+c);
        System.exit(0);
    }
}
