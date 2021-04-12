package puzzle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Puzzle57 {
    private final String first, last;

    public Puzzle57(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Puzzle57)) {
            return false;
        }
        Puzzle57 n = (Puzzle57)o;
        return n.first.equals(first) && n.last.equals(last);
    }
    public static void main(String[] args) {
        Set<Puzzle57> s = new HashSet<Puzzle57>();
        s.add(new Puzzle57("Mickey", "Mouse"));
        System.out.println(s.contains(new Puzzle57("Mickey", "Mouse")));

    }
}
