package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import data02.ResponseDto;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // 확인하자!!
            // System.out.println(responseJson); // 잘 나왔네! 주석처리!

            // gson으로 파싱하자.
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 통신 검증
            if (dto.getCode() != 1) {
                System.out.println(dto.getMsg()); // 왜 안됐는지 설명!
                return;
            }

            // 프로그램 만들기: 화면에 회원정보 띄우기
            // 일단 몇개인지 알아보자.
            // System.out.println(dto.getData().size()); //64개 인거 확인! 0번지~63번지! 주석!

            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("유저네임: " + dto.getData().get(i).getUsername()); // 왜 null로 뜨지?
                System.out.println("유저아이디: " + dto.getData().get(i).getId());
                System.out.println("유저패스워드: " + dto.getData().get(i).getPassword()); // 왜 null로 뜨지?
                System.out.println("유저이메일: " + dto.getData().get(i).getEmail()); // 왜 null로 뜨지?
                System.out.println("가입날짜: " + dto.getData().get(i).getCreated());
                System.out.println("로그인날짜: " + dto.getData().get(i).getUpdated());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}