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
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=vw%2B%2BqXlNQbiDoQvLCzwd8Oc383avr%2B%2BJ9gEdiBTAG5xFPofE%2BWtxwzeAxL1eSi7HPHciJy7crzQgQ2RqRc10gw%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=97&ny=75&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
            return weatherMap;

        } catch (

        Exception e) {
            System.out.println("조회오류");
        }
        return null;
    }
}