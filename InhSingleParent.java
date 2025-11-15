class InhSingleParent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class InhSingleChild extends InhSingleParent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}

public class InhSingle {
    public static void main(String[] args) {
        InhSingleChild obj = new InhSingleChild();
        obj.displayParent();
        obj.displayChild();
    }
}