package ex06;

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exitNum = 1;
        while (exitNum == 1) {
            System.out.println("프로그램 종료를 원하면 0을 입력하시오");
            int num = sc.nextInt();
            System.out.println("사용자입력: " + num);

            // num이 0일때, while문을 빠져나가시오.
            // 단, break를 사용할 수 없습니다.

            if (num == 0) {
                exitNum = 22424;
            }
        }
    }
}