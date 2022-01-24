package ex10;
// 버블정렬 실습해보기

import java.util.ArrayList;
import java.util.List;

// 1. 어레이리슽로 리스트 만들기 
// 2. 리스트 원소 비교하기
//3.  1회전
// 4. 끝까지 회전
//5. for문 
//6 . 눈으로 보기
//7.검증 

public class BubbleEx02 {
    public static void main(String[] args) {

        // 1. 어레이리스트 만들기
        List<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(73);
        list.add(42);
        list.add(32);
        list.add(90);

        // System.out.println(list.get(2));

        // 2. 리스트원소 비교하기
        int temp; // temp = 빈공간 만들기!!!

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
            System.out.println(list);
        }

        // // 1회전 시키자(4번 바꾸면 됨)
        // if (list.get(0) > list.get(1)) {
        // temp = list.get(0);
        // list.set(0, list.get(1));
        // list.set(1, temp);
        // }
        // // System.out.println(list.get(0)); // 0번지랑 1번지 바꼈네!! 확인 완료!!

        // if (list.get(1) > list.get(2)) {
        // temp = list.get(1);
        // list.set(1, list.get(2));
        // list.set(2, temp);
        // }

        // if (list.get(2) > list.get(3)) {
        // temp = list.get(2);
        // list.set(2, list.get(3));
        // list.set(3, temp);
        // }

        // if (list.get(3) > list.get(4)) {
        // temp = list.get(3);
        // list.set(3, list.get(4));
        // list.set(4, temp);
        // }

        // // System.out.println(list.get(0));
        // // System.out.println(list.get(1));
        // // System.out.println(list.get(2));
        // // System.out.println(list.get(3));
        // // System.out.println(list.get(4)); // 1회전 확인 완료

        // // 2회전 시작

        // if (list.get(0) > list.get(1)) {
        // temp = list.get(0);
        // list.set(0, list.get(1));
        // list.set(1, temp);
        // }
        // if (list.get(1) > list.get(2)) {
        // temp = list.get(1);
        // list.set(1, list.get(2));
        // list.set(2, temp);
        // }
        // if (list.get(2) > list.get(3)) {
        // temp = list.get(2);
        // list.set(2, list.get(3));
        // list.set(3, temp);
        // }

        // if (list.get(3) > list.get(4)) {
        // temp = list.get(3);
        // list.set(3, list.get(4));
        // list.set(4, temp);
        // }
        // // System.out.println(list.get(0));
        // // System.out.println(list.get(1));
        // // System.out.println(list.get(2));
        // // System.out.println(list.get(3));
        // // System.out.println(list.get(4)); // 2회전도 완료

        // // 3회전 시작
        // if (list.get(0) > list.get(1)) {
        // temp = list.get(0);
        // list.set(0, list.get(1));
        // list.set(1, temp);
        // }
        // if (list.get(1) > list.get(2)) {
        // temp = list.get(1);
        // list.set(1, list.get(2));
        // list.set(2, temp);
        // }
        // if (list.get(2) > list.get(3)) {
        // temp = list.get(2);
        // list.set(2, list.get(3));
        // list.set(3, temp);
        // }

        // if (list.get(3) > list.get(4)) {
        // temp = list.get(3);
        // list.set(3, list.get(4));
        // list.set(4, temp);
        // }
        // // System.out.println(list.get(0));
        // // System.out.println(list.get(1));
        // // System.out.println(list.get(2));
        // // System.out.println(list.get(3));
        // // System.out.println(list.get(4)); // 3회전 완료

        // // 4회전 시작
        // if (list.get(0) > list.get(1)) {
        // temp = list.get(0);
        // list.set(0, list.get(1));
        // list.set(1, temp);
        // }
        // if (list.get(1) > list.get(2)) {
        // temp = list.get(1);
        // list.set(1, list.get(2));
        // list.set(2, temp);
        // }
        // if (list.get(2) > list.get(3)) {
        // temp = list.get(2);
        // list.set(2, list.get(3));
        // list.set(3, temp);
        // }

        // if (list.get(3) > list.get(4)) {
        // temp = list.get(3);
        // list.set(3, list.get(4));
        // list.set(4, temp);
        // }
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3));
        // System.out.println(list.get(4)); // 정렬 완성!!!
    }
}
