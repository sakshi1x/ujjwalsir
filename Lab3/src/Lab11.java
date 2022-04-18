import javax.swing.*;

public class Lab11 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog("Enter the length of sqaure ");
        int b = Integer.parseInt(a);
        int c =b*b;
        JOptionPane.showMessageDialog(null,"square "+c);
        String p = JOptionPane.showInputDialog("Enter principle ");
        String r = JOptionPane.showInputDialog("enter rate ");
        String t = JOptionPane.showInputDialog("time ");
        int pr= Integer.parseInt(p);
        int ra=Integer.parseInt(r);
        int ti = Integer.parseInt(t);
        int si= (pr*ra*ti)/100;
        JOptionPane.showMessageDialog(null,si);
        String d =JOptionPane.showInputDialog("ENTER length of triangle ");
        String e = JOptionPane.showInputDialog("enter breadth of triangle ");
        String f =JOptionPane.showInputDialog("ENTER  height of triangle");
        int l = Integer.parseInt(d);
        int br= Integer.parseInt(e);
        int h = Integer.parseInt(f);
        int triangle = (l*br*h)/2;
        JOptionPane.showMessageDialog(null, triangle);
        String a1= JOptionPane.showInputDialog("enter the length of cuboid ");
        String a2=JOptionPane.showInputDialog(" breath of cuboid ");
        String a3= JOptionPane.showInputDialog(" HEIGHT Of cuboid");
        int b1= Integer.parseInt(a1);
        int b2= Integer.parseInt(a2);
        int b3= Integer.parseInt(a3);
        int v1= b1*b2*b3;
        JOptionPane.showMessageDialog(null,v1);
        String c1= JOptionPane.showInputDialog("LENGTH OF CUBE ");
        int c2=Integer.parseInt(c1);
        int v2= c2*c2*c2;
        JOptionPane.showMessageDialog(null,v2);
        System.exit(0);

    }
}
