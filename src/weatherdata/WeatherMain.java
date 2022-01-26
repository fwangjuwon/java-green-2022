package weatherdata;

import java.util.Map;
import java.util.Scanner;

public class WeatherMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======오늘의 날짜(20220126)를 입력하세요======");

        String baseDate = sc.nextLine();

        if (baseDate.length() != 8) {
            System.exit(0);
        }

        System.out.println("======발표시간(0600)을 입력하세요======");

        String baseTime = sc.nextLine();

        if (baseTime.length() != 4) {
            System.exit(0);
        }

        Map<String, String> weatherMap = WeatherTest.getWeatherList(baseDate, baseTime);

        System.out.println("수영구 남천동의 현재 풍속은" + weatherMap.get("WSD") + "m/s 입니다.");
        System.out.println("수영구 남천동의 현재 기온은" + weatherMap.get("T1H") + "도 입니다.");
        System.out.println("수영구 남천동의 현재 습도는" + weatherMap.get("REH") + "% 입니다.");
        System.out.println("수영구 남천동의 현재 풍향은" + weatherMap.get("VEC") + " 입니다.");
    }
}