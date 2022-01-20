package Lotto;

import java.util.*;

public class WordSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            set.add(input.next());
        }

        ArrayList<String> list = new ArrayList<>(set);

    }
}
