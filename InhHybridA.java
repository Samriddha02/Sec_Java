interface InhHybridA {
    void methodA();
}

interface InhHybridB extends InhHybridA {
    void methodB();
}

class InhHybridC implements InhHybridB {
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class InhHybrid {
    public static void main(String[] args) {
        InhHybridC obj = new InhHybridC();
        obj.methodA();
        obj.methodB();
    }
}