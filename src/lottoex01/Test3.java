package lottoex01;

import java.util.HashSet;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        // 3. hashset으로 랜덤한 로또 번호 6개 받기
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
        System.out.println(lotto);

        // 검증
        if (lotto.size() == 6) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
