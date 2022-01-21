package lottoex01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // 2. scanner로 금액 입력 받아서 횟수 정하기(5000원>5회)
        // ㄱ.Mock
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong(); // 금액 같은건 long 쓰는게 좋아 사용자 입장에서 생각해!! 사용자는 50억을 넣을 수도 있으니까 long을 하는게 나아!
        int count = (int) money / 1000; // downcasting 형변환!! long > int

        // ㄴ.눈으로 체크
        System.out.println("받은 금액:" + money);
        System.out.println("로또 횟수:" + count);

        // ㄷ.검증
        if (count == 5) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}
