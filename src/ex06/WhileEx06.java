package ex06;

public class WhileEx06 {
    public static void main(String[] args) {

        int n = 1;

        // 변수 n을 이용해서 2의 배수만 출력하세요.
        // 출력이 끝나면 break문으로 ㅃㅏ져 나오시오.

        while (true) {
            if (n % 2 == 0) {
                System.out.println(n);
            }

            n = n + 1;

            if (n > 10) {
                break;
            } // 조건문이 끝에 있는 것이 더 효율적이다. > 로직을 덜 타도 된다.
        }
    }
}
