import java.util.*;
public class ArrayInputSumAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Show the Elemnts of Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the all elements of the Array is :"+sum);
        float avg=sum/arr.length;
        System.out.println("Average of the Array is :"+avg);
        sc.close();
    }
}
