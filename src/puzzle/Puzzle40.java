package puzzle;

public class Puzzle40 {

    private Puzzle40 internalInstance = new Puzzle40();

    public Puzzle40() throws Exception {
        throw new Exception("I'm not coming out");
    }

    public static void main(String[] args) {
        try {
            Puzzle40 b = new Puzzle40();
            System.out.println("Surprise!");
        } catch (Exception ex) {
            System.out.println("I told you so");
        }
    }
}
