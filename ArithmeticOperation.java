import java.util.*;
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number a=");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number b=");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("a+b="+add);
        System.out.println("a-b="+sub);
        System.out.println("a*b="+mul);
        System.out.println("a/b="+div);
        sc.close();
    }
}
