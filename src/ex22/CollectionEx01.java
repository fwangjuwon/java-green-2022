package ex22;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEx01 {
    public static void main(String[] args) {
        // arraylist는 데이터가 중복돼도 되는 데이터 모임을 만들 때 쓰면 된다.
        ArrayList<String> datas = new ArrayList<String>(); // 제네릭 여러개의 데이터가 저장되는 제너릭 박스

        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        datas.set(1, "data2");

        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3));

    }
}
