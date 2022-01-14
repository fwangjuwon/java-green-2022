package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {

        System.out.println("출력할 구구단의 범위를 입력하시오.");
        System.out.println("   ");

        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int a = n1; a <= n2; a++) {
            for (int b = 1; b < 10; b++) {
                System.out.println(a + "*" + b + "=" + (a * b));
            }
            System.out.println("   ");
        }
    }
}
