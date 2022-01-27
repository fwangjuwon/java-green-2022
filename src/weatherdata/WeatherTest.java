package weatherdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class WeatherTest {
    public static Map<String, String> getWeatherList(String baseDate, String baseTime) {
        Map<String, String> weatherMap = new HashMap<>();

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=vw%2B%2BqXlNQbiDoQvLCzwd8Oc383avr%2B%2BJ9gEdiBTAG5xFPofE%2BWtxwzeAxL1eSi7HPHciJy7crzQgQ2RqRc10gw%3D%3D&numOfRows=1000&pageNo=1&dataType=JSON&base_date=20220126&base_time=0600&nx=99&ny=75");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);

            String resultCode = dto.getResponse().getHeader().getResultCode();
            // if (resultCode.equals(" 00")) { // 공백 00
            // System.out.println("resultCode : " + resultCode);
            // System.out.println("통신이 정상적으로 수행되지 않았습니다.");
            // return; // 스택 종료!!
            // }

            // int totalCount = dto.getResponse().getBody().getTotalCount();
            // if (totalCount == 0) {
            // System.out.println("통신에 결과가 0건입니다.");
            // return; // 스택종료
            // }

            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
            return weatherMap;

        } catch (

        Exception e) {
            System.out.println("조회오류" + e.getMessage());
        }
        return null;
    }
}