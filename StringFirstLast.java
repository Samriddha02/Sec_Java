import java.util.*;
public class StringFirstLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        System.out.println("First Letter : "+s1.charAt(0)+" And last Letter: "+s1.charAt(s1.length()-1));
        sc.close();
    }    
}
