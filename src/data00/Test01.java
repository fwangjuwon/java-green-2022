package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");
            // 변수 conn = byte stream 선!! 선에만 접근하고 read할건지 write할건진 니가 결정해
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 얘가 뭘 쓸지(httpsurl, httpurl...) 모르니까
            // 부모타입을 리턴해주는거. (니가 맞춰서 알아서 써라 요리사가 "음식
            // 나갑니다~~" 하면 종업원이 "짜장면 나왔습니다~" 하는거
            // downcasting)

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8") // 나는 공공데이터를 받아서 쓸거니까 . inputstream
            // utf-8: 한글을 3바이트로 끊어 읽겠다. 원래는 (default) 1byte씩 읽었기 떄문에, 한글이 깨지는거!
            );

            String ResponseJson = br.readLine(); // 빈 칸에 받아보자. 실제로 돌릴려면 while돌려야해 (얼마나 길어질 지 모르니까 ㅎㅎ )
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(ResponseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);
            // System.out.println(dto);

        } catch (Exception e) { // 주소가 틀렸을 때 나는오류 !!!
            System.out.println("주소 입력이 잘못됐다");
        }
    }
}
