package ex10;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[STUDENTS]; // 크기가 STUDENTS 인 배열 생성
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("성적 입력하세요: ");
            scores[i] = scan.nextInt(); // i번째 원소에 성적을 저장
        }

        for (int i = 0; i < STUDENTS; i++) {
            total += scores[i];
            System.out.println("평균성적:" + total / STUDENTS);
        }
    }
}
