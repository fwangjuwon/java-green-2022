package ex22;

import java.util.HashSet;
import java.util.Set;

public class CollectonEx04 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("b");
        s1.add("c");

        s2.add("b");
        s2.add("c");
        s2.add("f");

        Set<String> set = new HashSet<>(s1);
        set.addAll(s2);

        Set<String> set2 = new HashSet<>(s1);
        set.retainAll(s2);

        System.out.println(set);
        System.out.println(set2);
    }
}
