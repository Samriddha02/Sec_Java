public class BitwiseOperation {
    public static void main(String[] args) {
        int a = 5;
        int b=10;
        int And=a&b;
        int OR=a|b;
        int XOR=a^b;
        int NOT1=~a;
        int NOT2=~b;
        int LS1=a<<2;
        int LS2=b<<3;
        int RS1=a>>2;
        int RS2=b>>2;
        int US=b>>>2;
        System.out.println("a&b="+And);
        System.out.println("a|b="+OR);
        System.out.println("a^b="+XOR);
        System.out.println("~a="+NOT1);
        System.out.println("~b="+NOT2);
        System.out.println("a<<2="+LS1);
        System.out.println("b<<3="+LS2);
        System.out.println("a>>2="+RS1);
        System.out.println("b>>2="+RS2);
        System.out.println("b>>>2="+US);
    }
}
