package data02;

import java.util.List; //같은 패키지에 있게 해주는게 import

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {

    private int code; // 1성공, -1실패, 0은 데이터 없음
    private String msg; // 실패의 원인을 알려줌
    private List<User> data;
}
