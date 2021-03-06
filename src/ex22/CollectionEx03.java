package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {

        Random r = new Random();
        Set<Integer> datas = new HashSet<>();

        while (true) { // hashset사이즈가 6이 될 때까지 돌리면 된다. break 하고, hashset의 데이터 값을 출력한다.

            int n = r.nextInt(45) + 1; // 0~9

            datas.add(n);
            // hashset에 n값을 add해서 저장하라

            if (datas.size() == 6) {
                break;
            }
        }
        System.out.println(datas);
    }
}
