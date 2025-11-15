import java.util.*;
public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element of Array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of Even element in the Array ="+even);
        System.out.println("Number of Odd element in the Array ="+odd);
        sc.close();
    }
    
}
