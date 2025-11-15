public class ConditionalOperation {
    public static void main(String[] args) {
        int a=98;
        String result =(a%3==0)? "Divided by 3":"Not divided by 3";
        System.out.println("The number "+a+" is "+result);
    }
}
