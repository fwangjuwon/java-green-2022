package coronadata;

import java.util.List;
import java.util.Scanner;

import coronadata.CoronaDto.Response.Body.Items.Item;

public class CoronaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("코로나 현황 범위를 입력하세요.");
        System.out.println("ex) 20220110 시작일");

        String startCreateDt = sc.nextLine();

        System.out.println("ex) 20220115 종료일");

        String endCreateDt = sc.nextLine();

        List<Item> result = CoronaTest.getCoronaList(startCreateDt, endCreateDt);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("누적의심신고자 수:" + result.get(i).getAccExamCnt());
            System.out.println("사망자 수: " + result.get(i).getDeathCnt());
            System.out.println("확진자 수: " + result.get(i).getDecideCnt());
        }

    }
}
