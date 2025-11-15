class InhHierarchicalParent {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class InhHierarchicalBus extends InhHierarchicalParent {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers.");
    }
}

class InhHierarchicalTruck extends InhHierarchicalParent {
    void carryGoods() {
        System.out.println("Truck is carrying goods.");
    }
}

public class InhHierarchical {
    public static void main(String[] args) {
        InhHierarchicalBus bus = new InhHierarchicalBus();
        bus.move();
        bus.carryPassengers();

        System.out.println();

        InhHierarchicalTruck truck = new InhHierarchicalTruck();
        truck.move();
        truck.carryGoods();
    }
}