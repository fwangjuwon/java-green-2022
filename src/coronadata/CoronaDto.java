package coronadata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoronaDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode; // 결과코드
            private String resultMsg; // 결과메세지
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private long accExamCnt; // 누적의심신고검사자
                    private String createDt; // 등록일시분초
                    private int deathCnt; // 사망자수
                    private int decideCnt; // 확진자수
                    private int seq; // 게시글번호
                    private int stateDt; // 기준일
                    private String stateTime; // 기준시간
                    private String updateDt; // 수정일시분초
                }

            }
        }
    }
}
