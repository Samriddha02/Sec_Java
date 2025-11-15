class InhrTransport {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class InhrBus extends InhrTransport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers.");
    }
}

class InhrTruck extends InhrTransport {
    void carryGoods() {
        System.out.println("Truck is carrying goods.");
    }
}

public class InhrTransportExample {
    public static void main(String[] args) {
        InhrBus bus = new InhrBus();
        bus.move();
        bus.carryPassengers();

        System.out.println();

        InhrTruck truck = new InhrTruck();
        truck.move();
        truck.carryGoods();
    }
}