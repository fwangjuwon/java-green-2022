package ex10;

import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args) {
        int total = 0;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 크기 입력");
        size = scan.nextInt();
        int[] scores = new int[size]; // 변수로 배열의 크기를 지정

        for (int i = 0; i < scores.length; i++)
            total += scores[i];
        System.out.println("평균성적 " + total / scores.length);
    }
}
