package site.metacoding.hospapp.ex02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpConnectTimeoutException;

import com.google.gson.Gson;

//2nd 
//목적: json -> java 로 파싱하자. (라이브러리 gson쓰자) 
public class ParsingTest {
    public static void main(String[] args) {

        // 1. url 주소 만들기(끝)
        StringBuffer sbUrl = new StringBuffer();

        // end point - 내가 가야할 최종 목적지: 물음표 앞에까지

        // 계속 오류가 난다면, 서비스 키를 확인해서->아래처럼 encode시킨다.
        // String key =
        // URLEncoder.encode("wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D");

        sbUrl.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
        sbUrl.append("?serviceKey="); // 서비스키는 뭔지?
        sbUrl.append(
                "wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D");
        sbUrl.append("&pageNo="); // 몇번째 페이지인지?
        sbUrl.append("1");
        sbUrl.append("&numOfRows="); // 한 페이지당 몇개씩 가져 올지??
        sbUrl.append("10");
        sbUrl.append("&_type="); // 데이터 포맷은 어떤지??
        sbUrl.append("json");

        // 2. 다운로드 받기(끝)
        try {

            // URL safe가 적용되어있음 -> 더이상 반영안함
            URL url = new URL(sbUrl.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 다운캐스팅해서 알아서 잡아라 (dip - 구체적인게 아니라 추상적인
                                                                               // 거에 의존한다) conn=socket

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")); // 한글 안 깨지게
                                                                                                           // utf-8

            // 담는 것: 통신결과 모아두기
            StringBuffer sbDownload = new StringBuffer();

            while (true) {
                String input = br.readLine();

                if (input == null) { // 버퍼에 남은게 이제 없으면, 브레이크
                    break;
                }
                sbDownload.append(input);
            }

            // 3. 파싱
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(sbDownload.toString(), ResponseDto.class);

            // 4. 검증
            int itemSize = responseDto.getResponse().getBody().getItems().getItem().size();
            System.out.println("아이템 사이즈: " + itemSize); // 10개 확인! -> 5653개로 늘리자.
            System.out.println(responseDto.toString());

        } catch (Exception e) { // malformed(주소가 흉하게 생긴) -> 그냥 부모로 exception 으로 받는게 낫다 .알아서 동적바인딩해서 잡아준다.
            e.printStackTrace();
        }
    }
}
