package ex06;

public class TestEx02 {
    public static void main(String[] args) {
        boolean check = true;

        int n = 1; // 변수 초기화
        while (check) {

            System.out.println("안녕");

            n = n + 3; // 변수 증감식
            if (n > 10) { // 변수 조건식
                break;
            }
        }
    }
}
