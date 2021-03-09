package puzzle;

public class Puzzle27 {
    public static void main(String[] args) {
        int i = 0;
        while (-1 << i != 0)
            i++;
        System.out.println(i);

    }
}
