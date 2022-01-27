package data02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter, setter, toString을 자동 생성
@AllArgsConstructor // user의 id, username, pw... 생성자를 자동 생성
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
