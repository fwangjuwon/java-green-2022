package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 80; // 성적 초기화

        // 자바에서 괄호 다음에 중괄호 나오면 이 영역은 전부 행위의 영역이다.
        if (point >= 90) {
            System.out.println("A학점");
        } else { // if가 아니면
            System.out.println("A학점이 아닙니다");
        }

    }
}
