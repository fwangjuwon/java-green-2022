package ex22;

import java.util.*;

public class SortTest01 {
    public static void main(String[] args) {
        String[] example = { "Nice", "to", "meet", "you" };
        List<String> list = Arrays.asList(example); // 배열을 리스트로 무조건 변환!
        Collections.sort(list); // 리스트 정렬

        System.out.println(list);
    }
}