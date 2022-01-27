package data02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {

        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // conn 은 byte stream
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson); // 잘 받았는지 확인, 확인하고 제대로 됐는지 확인하려면 콘솔에 뜬거
            // 복사해서 온라인에서 jsonviewer로 확인한다.

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class); // json글자로 부터 읽어준다.

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패: " + dto.getMsg()); // 통신 실패 이유 알려줌 ㅎㅎ
                return; // 스택이 종료되는 거!! 데이터를 리턴해주지 않는것!!
            }

            // 2. 프로그램 만들기

            // ㄱ. 화면에 회원 정보를 띄운다. for문으로 돌린다.

            // System.out.println(dto.getData().size()); // 19바퀴 도는거 확인할 수 있음. 0~18까지 돈다.
            // 마지막 번호 18.

            for (int i = dto.getData().size() - 1; i >= 0; i--) { // 위에서부터 아래로 내려간다. for문을 거꾸로 돌림
                System.out.println("회원번호: " + dto.getData().get(i).getId());
                System.out.println("유저이름: " + dto.getData().get(i));
                System.out.println("비밀번호: " + dto.getData().get(i).getPassword());
                System.out.println("메일 주소: " + dto.getData().get(i).getEmail());
                System.out.println("가입날짜: " + dto.getData().get(i).getCreated());
                System.out.println("로그인날짜: " + dto.getData().get(i).getUpdated());
                System.out.println("------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류도 보여주고 추적해준다. 오류를 추적할 수 있는 로그를 콘솔에 보여줌
        }
    }
}
