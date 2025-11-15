import java.util.Scanner;

public class M2IfNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            if (age >= 60) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are an adult.");
            }
        } else {
            System.out.println("You are a minor.");
        }

        sc.close();
    }
}