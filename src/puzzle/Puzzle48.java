package puzzle;

class Dog48 {
    public static void bark() {
        System.out.println("woof");
    }
}
class Basenji extends Dog48 {
    public static void bark() { }
}
public class Puzzle48 {
    public static void main(String[] args) {
        Dog48 woofer = new Dog48();
        Dog48 nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}
