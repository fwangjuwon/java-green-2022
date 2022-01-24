package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyScanner {

    // 결론
    // inputstream: 바이트를 받는데 정수를 받는다.
    // inputstreamreader: 고정된 길이의 문자를 받는다.
    // bufferedreader: 가변길이의 문자를 받는다.

    InputStream in;
    InputStreamReader ir;
    BufferedReader br;

    MyScanner(InputStream in) {
        this.in = in;
        this.ir = new InputStreamReader(in);
        this.br = new BufferedReader(ir);
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }
}

// 이걸 만들어놓으면 할 떄마다 myscanner쓰면 된다.
// 얘를 언제 써야할까? 다른 회사에서 자기들 데이터를 줄 때, (카카오에서) kakao.in하면 된다. 공공데이터를 만들 수 있따. 어떤
// 웹사이트에 연결해서 버퍼로 읽은거 ㅎㅎ

public class StreamEx04 {
    public static void main(String[] args) {

        MyScanner ms = new MyScanner(System.in);
        try {
            String line = ms.readLine();
            System.out.println("받은 문자열" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Scanner sc = new Scanner(System.in); // 괄호 안 = 소스: 출발지 !! (키보드!!)
        // String line = sc.nextLine();
        // System.out.println(line); // 스캐너는 버퍼드리더랑 똑같은거야 ㅎㅎ내부는 결국 버퍼드리더로 만들어진거야
        // inputstreameader 가변길이의 문자를 받을 수
        // // 있으니까!!
    }
}
