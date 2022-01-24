package lottoex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        // 5. 로또 세트(hashset) 5개를 arraylist에 담기
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        HashSet<Integer> h3 = new HashSet<>();
        HashSet<Integer> h4 = new HashSet<>();
        HashSet<Integer> h5 = new HashSet<>();

        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
    }
}
