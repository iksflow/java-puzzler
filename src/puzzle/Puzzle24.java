package puzzle;

public class Puzzle24 {
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.println("Joy!");
        }
    }
}
