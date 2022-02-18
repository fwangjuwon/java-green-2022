package pcrtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.google.gson.Gson;

public class CoronaTest {

    public static void main(String[] args) {

        String addr = "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=5190&_type=json";

        try {
            URL url = new URL(addr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();
            CoronaDto coronaDto = gson.fromJson(responseJson, CoronaDto.class);

            List<Hospital> result = coronaDto.getResponse().getBody().getItems().getItem();

            Connection conndb = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
            System.out.println("db연결 했어!");

            String sql = "INSERT INTO Hospital(addr, mgtStaDd, pcrPsblYn, ratPsblYn, recuClCd, rprtWorpClicFndtTgtYn, sgguCdNm, sidoCdNm, telno, XPos, XPosWgs84, YPos, YPosWgs84, yadmNm, ykihoEnc) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conndb.prepareStatement(sql);

            for (int i = result.size() - 1; i >= 0; i--) {
                pstmt.setString(1, result.get(i).getAddr());
                pstmt.setString(2, result.get(i).getMgtStaDd());
                pstmt.setString(3, result.get(i).getPcrPsblYn());
                pstmt.setString(4, result.get(i).getRatPsblYn());
                pstmt.setString(5, result.get(i).getRecuClCd());
                pstmt.setString(6, result.get(i).getRprtWorpClicFndtTgtYn());
                pstmt.setString(7, result.get(i).getSgguCdNm());
                pstmt.setString(8, result.get(i).getSidoCdNm());
                pstmt.setString(9, result.get(i).getTelno());
                pstmt.setString(10, result.get(i).getXPos());
                pstmt.setString(11, result.get(i).getXPosWgs84());
                pstmt.setString(12, result.get(i).getYPos());
                pstmt.setString(13, result.get(i).getYPosWgs84());
                pstmt.setString(14, result.get(i).getYadmNm());
                pstmt.setString(15, result.get(i).getYkihoEnc());

                int update = pstmt.executeUpdate();

                if (update > 0) {
                    System.out.println("셩공");
                } else {

                    System.out.println("실패");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
