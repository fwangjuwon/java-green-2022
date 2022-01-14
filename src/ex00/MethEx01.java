package ex00;

//계산기 만들기: 상태와 행위를 무조건 다 들고 있을 필요는 없다. 
class Calculator {

    // add뒤에 있는 ()가 입구
    // void 는 출구가 없다는 뜻
    void add(int n1, int n2) {
        System.out.println("더하기 메서드 입니다");
        System.out.println(n1 + n2);
    }

    void minus(int n1, int n2) {
        System.out.println("마이너스 메서드 입니다.");
        System.out.println(n1 - n2);
    }

    // 곱하기

    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드 입니다.");
        System.out.println(n1 * n2);
    }
    // 나누기

    void divide(int n1, int n2) {
        System.out.println("나누기 메서드 입니다.");
        System.out.println(n1 / n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.add(10, 4);
        c1.minus(10, 1);
        c1.multi(10, 3);
        c1.divide(20, 5);
    }
}
