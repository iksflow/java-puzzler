package puzzle;

import java.util.Calendar;

public class Puzzle49 {
    public static final Puzzle49 INSTANCE = new Puzzle49();
    private final int beltSize;
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private Puzzle49() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
    }
}
