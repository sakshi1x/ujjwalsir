import javax.swing.*;

public class Lab2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("enter you age");
        int age= Integer.parseInt(a);
        String b= (age>=18)?"eligible for voting":"not eligible for voting";
        JOptionPane.showMessageDialog(null,b);
        System.exit(0);
    }
}
