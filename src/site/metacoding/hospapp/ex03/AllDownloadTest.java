package site.metacoding.hospapp.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.script.SimpleBindings;

import com.google.gson.Gson;

// 목적 :  5653개 다운로드 받기
// 전략 : (1) 다운로드 1번 -> totalCount 확인
//           (2) totalCount 만큼 다운로드 - 파싱 - 검증(item 사이즈)       
public class AllDownloadTest {

    public static int getTotalCount() {

        int totalCount = 0;

        try {

            // 1. URL 주소 만들기 - totalCount 확인용
            StringBuffer sb = new StringBuffer();

            sb.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
            sb.append("?serviceKey="); // 서비스키
            sb.append("wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g==");
            sb.append("&pageNo=?"); // 몇번째 페이지 인지
            sb.append("1");
            sb.append("&numOfRows=");
            sb.append("2"); // totalCount 체크만 할 것이기 때문에 2개만 받아도 된다. (왜 2개냐면 1개만 받으면 List가 아니라 Object로 받더라)
            sb.append("&_type=");
            sb.append("json"); // 데이터 포맷은 JSON

            // 2. 다운로드 받기 - totalCount 확인용

            URL url = new URL(sb.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            StringBuffer sbDownload = new StringBuffer(); // 통신결과 모아두기
            while (true) {
                String input = br.readLine();
                if (input == null) {
                    break;
                }
                sbDownload.append(input);
            }

            // 3. 검증 - totalCountCheck
            // System.out.println(sb.toString());

            // 4. 파싱
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(sbDownload.toString(), ResponseDto.class);

            // 5. totalCount 담기
            totalCount = responseDto.getResponse().getBody().getTotalCount();
            System.out.println("totalCount : " + totalCount);
            return totalCount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalCount;
    }

    public static ResponseDto download() {

        ResponseDto responseDto = null;

        try {
            // 6. 전체 데이터 받기
            // (1) URL 주소 만들기
            int totalCount = getTotalCount();

            if (totalCount == 0) {
                System.out.println("totalCount를 제대로 받지 못하였습니다.");
                return null;
            }

            StringBuffer sb = new StringBuffer();

            sb.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
            sb.append("?serviceKey="); // 서비스키
            sb.append("wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g==");
            sb.append("&pageNo=?"); // 몇번째 페이지 인지
            sb.append("1");
            sb.append("&numOfRows=");
            sb.append(totalCount); // totalCount 체크만 할 것이기 때문에 2개만 받아도 된다. (왜 2개냐면 1개만 받으면 List가 아니라 Object로 받더라)
            sb.append("&_type=");
            sb.append("json"); // 데이터 포맷은 JSON

            // (2) 다운로드 받기
            URL url = new URL(sb.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            StringBuffer sbDownload = new StringBuffer(); // 통신결과 모아두기
            while (true) {
                String input = br.readLine();
                if (input == null) {
                    break;
                }
                sbDownload.append(input);
            }

            // (3) 파싱
            Gson gson = new Gson();
            responseDto = gson.fromJson(sbDownload.toString(), ResponseDto.class);

            // 7. 사이즈 검증
            System.out.println("아이템 사이즈 : " + responseDto.getResponse().getBody().getItems().getItem().size());
            System.out.println("totalCount : " + totalCount);
            if (responseDto.getResponse().getBody().getItems().getItem().size() == totalCount) {
                System.out.println("성공~~~~~~~~~~~~~~~~");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseDto;
    }

    public static void main(String[] args) {
        download();
    }

}

/**
 * package site.metacoding.hospapp.ex03;
 * 
 * import java.io.BufferedReader;
 * import java.io.InputStream;
 * import java.io.InputStreamReader;
 * import java.net.HttpURLConnection;
 * import java.net.MalformedURLException;
 * import java.net.URL;
 * import java.net.URLEncoder;
 * import java.net.http.HttpConnectTimeoutException;
 * 
 * import com.google.gson.Gson;
 * 
 * //3rd
 * //목적: 5653개 다운로드 받기
 * //전략: (1) 다운로드 1번받고 -> totalCount확인
 * // (2) totalcount만큼 다운로드 - 파싱 - 검증( item사이즈)
 * public class AllDownloadTest {
 * public static void main(String[] args) {
 * 
 * // 1. url 주소 만들기 -> totalcount확인용
 * StringBuffer totalCountCheckUrl = new StringBuffer();
 * 
 * totalCountCheckUrl.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
 * totalCountCheckUrl.append("?serviceKey="); // 서비스키는 뭔지?
 * totalCountCheckUrl.append(
 * "wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D");
 * totalCountCheckUrl.append("&pageNo="); // 몇번째 페이지인지?
 * totalCountCheckUrl.append("1");
 * totalCountCheckUrl.append("&numOfRows="); // 한 페이지당 몇개씩 가져 올지?? (토탈카운트 체크만
 * 할거기 때문에 2개만 받아도 되!)
 * totalCountCheckUrl.append("2"); // 한개만 받아도 totalcount받을 수 있다. -> 배열(list)로
 * 안주고 중괄호(object)로 주더라... -> 1보다 큰거 2로
 * // 하면되
 * totalCountCheckUrl.append("&_type="); // 데이터 포맷은 어떤지??
 * totalCountCheckUrl.append("json");
 * 
 * // 2. 다운로드 받기 -> totalcount확인용
 * try {
 * URL urlTemp = new URL(totalCountCheckUrl.toString());
 * HttpURLConnection connTemp = (HttpURLConnection) urlTemp.openConnection(); //
 * 다운캐스팅해서 알아서 잡아라 (dip - 구체적인게
 * // 아니라 추상적인
 * // 거에 의존한다) conn=socket
 * 
 * BufferedReader brTemp = new BufferedReader(new
 * InputStreamReader(connTemp.getInputStream(), "utf-8")); // 한글
 * // 안
 * // 깨지게
 * // utf-8
 * 
 * // 담는 것: 통신결과 모아두기
 * StringBuffer sbTotalCountCheck = new StringBuffer();
 * 
 * while (true) {
 * String input = brTemp.readLine();
 * 
 * if (input == null) { // 버퍼에 남은게 이제 없으면, 브레이크
 * break;
 * }
 * sbTotalCountCheck.append(input);
 * }
 * 
 * // 3. 검증 - totalcountcheck
 * System.out.println(sbTotalCountCheck.toString());
 * 
 * // 4. 파싱
 * Gson gsonTemp = new Gson();
 * ResponseDto totalCountCheckDto =
 * gsonTemp.fromJson(sbTotalCountCheck.toString(),
 * ResponseDto.class);
 * 
 * // 5. totalcount담기
 * int totalCount = totalCountCheckDto.getResponse().getBody().getTotalCount();
 * System.out.println("토탈카운트: " + totalCount); // 5653 잘 뜨네
 * 
 * // 6. 다운로드 - 전체 데이터 받기
 * 
 * // (1) url 주소 만들기
 * StringBuffer sbUrl = new StringBuffer();
 * 
 * sbUrl.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
 * sbUrl.append("?serviceKey="); // 서비스키는 뭔지?
 * sbUrl.append(
 * "wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D");
 * sbUrl.append("&pageNo="); // 몇번째 페이지인지?
 * sbUrl.append("1");
 * sbUrl.append("&numOfRows="); // 한 페이지당 몇개씩 가져 올지?? (토탈카운트 체크만 할거기 때문에 2개만 받아도
 * 되!)
 * sbUrl.append(totalCount); // 한개만 받아도 totalcount받을 수 있다. -> 배열(list)로 안주고
 * 중괄호(object)로 주더라... -> 1보다 큰거 2로
 * // 하면되
 * sbUrl.append("&_type="); // 데이터 포맷은 어떤지??
 * sbUrl.append("json");
 * 
 * // (2) 다운로드 받기
 * 
 * URL url = new URL(sbUrl.toString());
 * HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 다운캐스팅해서
 * 알아서 잡아라 (dip - 구체적인게 아니라 추상적인
 * // 거에 의존한다) conn=socket
 * 
 * BufferedReader br = new BufferedReader(new
 * InputStreamReader(conn.getInputStream(), "utf-8")); // 한글 안 깨지게
 * // utf-8
 * 
 * // 담는 것: 통신결과 모아두기
 * StringBuffer sb = new StringBuffer();
 * 
 * while (true) {
 * String input = br.readLine();
 * 
 * if (input == null) { // 버퍼에 남은게 이제 없으면, 브레이크
 * break;
 * }
 * sb.append(input);
 * }
 * 
 * // (3)파싱
 * Gson gson = new Gson();
 * ResponseDto responseDto = gson.fromJson(sb.toString(),
 * ResponseDto.class);
 * 
 * // 7. 최종 점검
 * System.err.println("item size: " +
 * responseDto.getResponse().getBody().getItems().getItem().size());
 * System.out.println("total count: " + totalCount);
 * if (responseDto.getResponse().getBody().getItems().getItem().size() ==
 * totalCount) {
 * System.out.println("검증완료!");
 * }
 * 
 * } catch (Exception e) { // malformed(주소가 흉하게 생긴) -> 그냥 부모로 exception 으로 받는게
 * 낫다 .알아서 동적바인딩해서 잡아준다.
 * e.printStackTrace();
 * }
 * }
 * }
 * 
 */