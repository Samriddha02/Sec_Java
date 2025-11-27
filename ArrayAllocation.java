import java.util.Scanner;

public class ArrayAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        
        try {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Array allocated successfully with size: " + size);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        }
    }
}