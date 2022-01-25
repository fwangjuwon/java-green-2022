package data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

class 사자 {
    private String name;
    private String color; // 1차개발자는 내가 사자를 만들지, 네임을 만들지 암것도 몰라 근데 어떻게 getter setter 자동으로 줄 수 있냐 >
                          // reflection > 이게 lombok 이야.
}

public class TestLombok {
    public static void main(String[] args) {

        사자 s = new 사자("사자", "노랑");
        System.out.println(s.getName());
    }
}
