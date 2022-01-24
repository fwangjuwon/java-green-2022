package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        // 4. hashset은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요(구글링) > data는 Mock으로 만들면 됨 ㅎㅎ
        HashSet<Integer> lotto = new HashSet<>();

        Random r = new Random();

        // 반복해서 lotto에 담기(6개)
        // set자료 구조는 중복되는 데이터가 들어가면 허용하지 않음
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n); // for로하면 안되는 이유: 중복된 애들 나오면 또 돌아야하니까 !! while로 해야됨

            if (lotto.size() == 6)
                break; // if에서만 한줄짜리 코드는 중괄호 생략가능하다(자바에서)
        }

        Iterator<Integer> lottolist = lotto.iterator();
        while (lottolist.hasNext()) {
            System.out.println(lottolist.next() + " ");
        }

        List<Integer> list = new ArrayList<>(lotto);

        Collections.sort(list); // test4 끝
        System.out.println(list);

        // 검증

        for (int i = 0; i < 5; i++) {
            if (list.get(i) < list.get(i + 1)) {
                System.out.println(i + "번지와" + (i + 1) + "번지 비교 성공");
            } else {
                System.out.println(i + "번지와" + (i + 1) + "번지 비교 실패");
            }
        }
    }
}
