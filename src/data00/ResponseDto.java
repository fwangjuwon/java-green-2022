package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // 게터와 세터와 투스트링 다 들고 있따.
@AllArgsConstructor
public class ResponseDto {
    private Response response; // 변수명을 키 값과 꼭 동일하게 해야한다.!!!

    @Data // 게터와 세터와 투스트링 다 들고 있따.
    @AllArgsConstructor
    class Response { // 내부 클래스 !!
        private Header header;
        private Body body;

        @Data // 게터와 세터와 투스트링 다 들고 있따.
        @AllArgsConstructor
        class Header { // response 의 내부클래스
            private String resultCode;
            private String resultMsg;
        }

        @Data // 게터와 세터와 투스트링 다 들고 있따.
        @AllArgsConstructor
        class Body { // response 의 내부클래스
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @Data // 게터와 세터와 투스트링 다 들고 있따.
            @AllArgsConstructor
            class Items { // body 의 내부 클래스
                private List<Item> item;
            }
        }
    }
}

@Data // 게터와 세터와 투스트링 다 들고 있따.
@AllArgsConstructor
class Item {
    private String airlinNm;
    private String arrAirportNm; // string은 무적!!!!
    private String arrPlandTime;
    private String depAirportNm;
    private String depPlandTime;
    private int economyCharge;
    private int prestigeCharge;
    private String vihicleId;
}
