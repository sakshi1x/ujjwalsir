public class Lab20 {

    public static void main(String args[]) {
        int sal = 8600;
        double da = 20 / 100.0 * sal;
        double hra = 10 / 100.0 * sal;
        double cta = 12 / 100.0 * sal;
        double gross = sal + da + hra + cta;
        System.out.println("Gross Salary = " + gross);
    }
}
