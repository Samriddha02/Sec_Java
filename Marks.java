import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Three subject (0-100)");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=a+b+c;
        float e=d/3;
        System.out.println("Total Marks :"+d);
        System.out.println("Average Marks :"+e);
        sc.close();    
    }
}
