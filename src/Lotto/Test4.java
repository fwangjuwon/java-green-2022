package Lotto;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        // 4. hashset에 순서대로 정렬하기
        Random r = new Random();
        HashSet<Integer> mydata = new HashSet<>();

        while (true) { // hashset사이즈가 6이 될 때까지 돌리면 된다. break 하고, hashset의 데이터 값을 출력한다.

            int n = r.nextInt(45) + 1; // 0~9

            mydata.add(n);
            // hashset에 n값을 add해서 저장하라

            // Set<Integer> lotto = new HashSet<>();
            // ArrayList<Set<Integer>>list = new ArrayList<>();

            // class lottelist{
            // Set<Integer>
            // }

            if (mydata.size() == 6) {
                break;
            }
        }
        List<Integer> lottoList = new LinkedList<>(mydata);
        Collections.sort(lottoList);

        System.out.println(lottoList);
    }
}
