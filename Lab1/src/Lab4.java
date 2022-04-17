public class Lab4 {
    public static void main(String[] args){
        int sub1=50;
        int sub2=30;
        int sub3=25;
        int sub4=40;
        int total=(sub1+sub2+sub3+sub4)/4;
        String grade=(total>=70)?"first class":(total<70&&total>=59)?"second class":(total<59&&total>=49)?"third class":"fail";
        System.out.println(grade);
    }
}





