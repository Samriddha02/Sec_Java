class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
        Dog d1 = new Dog();
        d1.sound();
        Animal ref = new Dog();
        ref.sound();
}