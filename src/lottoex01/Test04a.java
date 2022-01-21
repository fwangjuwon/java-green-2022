package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test04a {
    public static void main(String[] args) {

        // 4. hashset은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요(구글링) > data는 Mock으로 만들면 됨 ㅎㅎ
        // mock
        HashSet<Integer> lotto = new HashSet<>();
        lotto.add(1);
        lotto.add(30);
        lotto.add(25);
        lotto.add(8);
        lotto.add(45);
        lotto.add(17);

        System.out.println(lotto);

        // test
        List<Integer> sl = new ArrayList<>(lotto);
        Collections.sort(sl);

        // 눈으로 확인
        System.out.println(sl);

        // 검증 : if로 노가다로 하고 for로 5번 돌리면 된다는걸 확인!!

        for (int i = 0; i < 5; i++) {
            if (sl.get(i) < sl.get(i + 1)) {
                System.out.println(i + "번지와" + (i + 1) + "번지 비교 성공");
            } else {
                System.out.println(i + "번지와" + (i + 1) + "번지 비교 실패");
            }
        }

        // int failCheck = 0;

        // if (sl.get(0) < sl.get(1)) {
        // System.out.println("0번지 1번지 비교 - 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(1) < sl.get(2)) {
        // System.out.println("1번지 2번지 비교 - 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(2) < sl.get(3)) {
        // System.out.println("2번지 3번지 비교 - 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(3) < sl.get(4)) {
        // System.out.println("3번지 4번지 비교 - 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(4) < sl.get(5)) {
        // System.out.println("4번지 5번지 비교 - 성공");
        // } else {
        // failCheck++;
        // }

        // System.out.println("실패횟수" + failCheck);
    }
}
