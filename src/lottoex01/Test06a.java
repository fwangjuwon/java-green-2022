package lottoex01;

import java.util.Arrays;
import java.util.List;

public class Test06a {
    public static void main(String[] args) {
        // 6. arraylist 로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 7, 9, 22); // add 하나씩 안하고 한꺼번에 하는 arraylist 메서드!!
        List<Integer> lotto2 = Arrays.asList(3, 6, 27, 5, 7, 38);

        System.out.println("로또 1번" + lotto1.toString());
        System.out.println("로또 2번" + lotto2.toString());

        int failCheck = 0;
        final int LOTTOCYCLE = lotto1.size(); // final이 붙은 변수는 대문자로 정의한다!!

        for (int i = 0; i < LOTTOCYCLE; i++) {
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println(i + "번지 값이 일치");
            } else {
                failCheck++;
            }
        }

        // 검증
        if (failCheck == 0) {
            System.out.println("당첨!");
        } else {
            System.out.println("꽝!");
        }

        // if (lotto1.get(0) == lotto2.get(0)) {
        // System.out.println("0번지 값이 일치해");
        // } else {
        // failCheck++;
        // }

        // if (lotto1.get(1) == lotto2.get(1)) {
        // System.out.println("1번지 값이 일치해");
        // } else {
        // failCheck++;
        // }

        // 이건 다른 방법!!
        // lotto1.containsAll(lotto2);
        // System.out.println("로또1번과 2번의 비교" + lotto1.contains(lotto2));
    }
}
