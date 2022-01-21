package jsonex01;

import com.google.gson.Gson;

//Dto = Data Transfer Object
class UserDto {
    // json 표기법 자체는 string이다.
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class GsonEx01 {
    public static void main(String[] args) {

        // javaobject - > json로 변경 (데이터 전송이 목적!!)
        UserDto userDto = new UserDto("won5354", "12345");
        Gson gson = new Gson(); // toJson(), fromJson()

        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // json->javaobject로 변경(데이터 다운로드 목적)
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(javaUserDto.getUsername());
        System.out.println(javaUserDto.getPassword());
    }
}
