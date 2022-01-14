package ex00;

/**
 * 이것은 주석이다.
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단, 출구(return)는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈(특정한 역할(목적)을 수행하는)이 될 수 있다.
 * 3. 출구가 없을 때 void 사용, 출구 있을 때는 타입을 입구와 동일하게 해준다.
 * 4. 메서드 내부(queue)를 몰라도 사용할 수 있다. (캡슐화)
 * 5. 메서드는 1급 객체인가? > 아니다. 자바에서는 1급 객체가 class밖에 없다.
 * 6. 특정한 역할(목적)을 수행하는 코드 꾸러미를 만들기 위해서 메서드를 만든다.
 * - 캡슐화, 재사용, 코드관리, 메모리관리도 편하다.
 * 7. static 메서드 내부에서는 heap에 있는 데이터(상태)를 찾을 수 없다.
 */

public class MethEx03 {

    int sum = 0;

    void start() {
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;
    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03();
        m.start(); // 클래스명 생략 가능(같은 클래스에 있기 때문에!!)
        System.out.println(m.sum); // 메서드의 실행결과를 힙에 보관
    }
}