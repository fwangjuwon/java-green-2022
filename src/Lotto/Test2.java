package Lotto;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력 받아서 횟수 정하기
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println(price);
        System.out.println("로또횟수" + price / 1000);
    }
}
