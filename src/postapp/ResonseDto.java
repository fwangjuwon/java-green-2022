package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResonseDto {
    private int code; // 1성공, -1실패, 0은 데이터 없음
    private String msg; // 실패의 원인을 알려줌
    private List<Post> data;
}
