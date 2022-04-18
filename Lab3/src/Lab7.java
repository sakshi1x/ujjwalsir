import javax.swing.*;

public class Lab7 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog("enter number");
        int b = Integer.parseInt(a);
        int c =b*b;
        JOptionPane.showMessageDialog(null,c );

        System.exit(0);
    }
}
