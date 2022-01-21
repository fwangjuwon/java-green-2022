package lottoex01;

import java.util.ArrayList;

/**
 * 단위 테스트
 * 1. arrylist에 숫자 6개 담기
 * 2. scanner로 금액 입력 받아서 횟수 정하기(5000원>5회)
 * 3. hashset으로 랜덤한 로또 번호 6개 받기
 * 4. hashset은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요(구글링)
 * 5. 로또 세트(hashset) 5개를 arraylist에 담기
 * 6. arraylist 로또 2개 만들어서 비교해보기
 */
public class Test1 {

    public static void main(String[] args) {

        // 1. arrylist에 숫자 6개 담기(Mock데이터 > 샘플로 받아놓은 데이터들: https://www.crocus.co.kr/1555)
        ArrayList<Integer> buyLotto = new ArrayList<>();
        buyLotto.add(5);
        buyLotto.add(15);
        buyLotto.add(20);
        buyLotto.add(25);
        buyLotto.add(30);
        buyLotto.add(35);

        // 눈으로 테스트한건 좋은방법 아냐
        System.out.println(buyLotto);

        // 검증
        if (buyLotto.size() == 6) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
