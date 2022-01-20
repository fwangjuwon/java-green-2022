package Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {

        // 1. arrylist에 당첨번호 담기
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(3);
        data.add(5);
        data.add(30);
        data.add(40);
        data.add(41);
        data.add(42);

        System.out.println(data);

        // 2. scanner로 금액 입력받기
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("로또 횟수" + price / 1000);

        // 3. 금액/1000해서 해쉬세트의 개수 구하기 > 해쉬세트의 크기 구하려면 size이용

        // 4. 해쉬세트에 로또 번호 받기 ( 5회 )

        Random r = new Random();
        HashSet<Integer> mydata = new HashSet<Integer>();

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

            // 5. 해쉬세트로 받은 값을 어레이리스트에 넣기

            // for (int i = 0; i < n; ++i) {
            // set.add(input.next());
            // }

            // ArrayList<String> list = new ArrayList<>(set);

            // 5. 어레이리스트에 내가 넣은 값을 정렬하기.

            // 6. 두 값을 비교하기.
        }
        System.out.println(mydata);
    }

}
