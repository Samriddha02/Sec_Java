import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search :");
        int S=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==S){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("The element is found at "+index+" index number");
        }
        else{
            System.out.println("Element not found in the Array.");
        }
        sc.close();
    }
}
