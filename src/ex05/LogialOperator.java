package ex05;

public class LogialOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // 논리연산자: 둘 다 boolean타입이어야한다.
        // &&그리고 직렬회로
        // || 거나 병렬회로
        System.out.println((x == 3) && (y == 7));
        System.out.println((x == 3) || (y == 4));
    }

}
