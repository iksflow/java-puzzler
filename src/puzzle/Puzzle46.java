package puzzle;

public class Puzzle46 {
    private Puzzle46(Object o) {
        System.out.println("Object");
    }

    private Puzzle46(double[] dArray) {
        System.out.println("double array");
    }
    public static void main(String[] args) {
        new Puzzle46(null);
    }
}
