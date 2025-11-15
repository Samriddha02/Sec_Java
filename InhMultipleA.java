interface InhMultipleA {
    void showA();
}

interface InhMultipleB {
    void showB();
}

class InhMultipleC implements InhMultipleA, InhMultipleB {
    public void showA() {
        System.out.println("This is interface A");
    }

    public void showB() {
        System.out.println("This is interface B");
    }
}

public class InhMultiple {
    public static void main(String[] args) {
        InhMultipleC obj = new InhMultipleC();
        obj.showA();
        obj.showB();
    }
}