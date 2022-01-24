package ex22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashEx01 {
    public static void main(String[] args) {

        // 1.. 순차적으로 데이터를 저장하고 싶을 때 - list
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1); // 내부적으로 tostring메소드가 호출되는 것

        // 2. 데이터의 중복을 피하고 싶을 때
        Set<Integer> arr2 = new HashSet<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(3);
        System.out.println(arr2);

        // 3. hashmap!!! 키 값으로 데이터를 검색하고 싶을 때 ㅎㅎ
        Map<String, String> arr3 = new HashMap<>(); // 키값, 밸류값
        arr3.put("name", "황주원");
        arr3.put("gender", "여");
        arr3.put("전번", "01033330000");
        System.out.println(arr3);
        System.out.println(arr3.get("name"));
        System.out.println(arr1.get(0));
        System.out.println(arr3.get("전번"));
    }

}
