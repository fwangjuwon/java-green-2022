package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {
    // 얘는 진짜 중요해 ㅎㅎㅎ ex01,02는 단점만 정리 ㅎㅎ (input stream, input streamreader 의 단점)
    public static void main(String[] args) {
        InputStream in = System.in; // 단점: 한 자씩 숫자로 받는다.
        InputStreamReader ir = new InputStreamReader(in); // 단점: 고정된 길이를 받는다.
        BufferedReader br = new BufferedReader(ir); // br은 버퍼 ㅎㅎ 항상 in과 ir을 통해서 만들어야한다. 장점: 가변길이의 문자열을 받는다. 어짜피 얘밖에 안써
        // 이렇게 만들어진게 scanner이다.

        // BufferedReader reader = new BufferedReader(
        // new InputStreamReader(System.in)); 위에 세 줄을 한줄로 적고 싶을 때 !! ㅎㅎ

        try {
            String line = br.readLine();
            System.out.println("받은 문자열:" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
