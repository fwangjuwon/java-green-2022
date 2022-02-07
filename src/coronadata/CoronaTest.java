package coronadata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import coronadata.CoronaDto.Response.Body.Items.Item;

public class CoronaTest {
    public static List<Item> getCoronaList(String startCreateDt, String endCreateDt) {

        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startCreateDt + "&endCreateDt=" + endCreateDt + "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();
            CoronaDto coronaDto = gson.fromJson(responseJson, CoronaDto.class);

            List<Item> result = coronaDto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            System.out.println("조회오류" + e.getMessage());
        }
        return null;
    }
}
