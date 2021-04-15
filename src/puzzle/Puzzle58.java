package puzzle;

import java.util.HashSet;
import java.util.Set;

public class Puzzle58 {
    private final String first, last;

    public Puzzle58(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Puzzle58 n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Puzzle58> s = new HashSet<Puzzle58>();
        s.add(new Puzzle58("Donald", "Duck"));
        System.out.println(s.contains(new Puzzle58("Donald", "Duck")));
    }
}
