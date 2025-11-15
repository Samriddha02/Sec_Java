import java.util.*;
public class InceDecreOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to perform Operations: ");
        int x=sc.nextInt();
        System.out.println(+x);
        System.out.println(-x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x--);
        sc.close();
    }
}

