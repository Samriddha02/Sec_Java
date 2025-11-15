import java.util.*;
public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A string");
        String s1=sc.nextLine();  //input from user
        String s2="HADI"; //store in variable
        String s3=new String("ZAMAN"); // using new keyword
        System.out.println(s1+" "+s2+" "+s3);
        System.out.println(s1.length()); //length of String
        System.out.println(s2+""+s1+" "+s3); //Concatanation
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(s2.length()-1));
        System.out.println(s2.substring(1,3)); //from index 1 to 3
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3)); //ignores upper lower alphabets
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.indexOf("A"));
        System.out.println(s3.replace("A", "O"));
        sc.close();
    }
}
