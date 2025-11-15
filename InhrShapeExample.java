class InhrShape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class InhrCircle extends InhrShape {
    double radius;

    InhrCircle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class InhrRectangle extends InhrShape {
    double length, width;

    InhrRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class InhrShapeExample {
    public static void main(String[] args) {
        InhrCircle c = new InhrCircle(5);
        c.displayShape();
        c.area();

        InhrRectangle r = new InhrRectangle(6, 4);
        r.displayShape();
        r.area();
    }
}