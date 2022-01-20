package Lotto;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 2개의 list데이터 비교하기

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(15);
        list1.add(20);

        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(18);
        list2.add(20);

        System.out.println(list1);
        System.out.println(list2);

        boolean failCheck = false;

        for (int i = 0; i < 6; i++) {
            if (list1.get(i) != list2.get(i)) {
                failCheck = true;
                System.out.println("로또 미당첨");
                break;
            }
        }

        if (failCheck == false) {
            System.out.println("로또 당첨!");
        }
    }
}
