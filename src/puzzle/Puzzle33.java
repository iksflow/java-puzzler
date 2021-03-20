package puzzle;

public class Puzzle33 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        while (i == -i && i != 0) {
            System.out.println("inf");
        }
    }
}
