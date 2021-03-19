package puzzle;

public class Puzzle32 {
    public static void main(String[] args) {
        Integer i = new Integer(0);
        Integer j = new Integer(0);

        while (i <= j && j <= i && i != j) {
            System.out.println("inf");
        }

    }
}
