package srp;

public class 음식 { // 설계도. 메인에서 안 만든 이유: 요리사가 만들어야할 책임이 있으니까 ㅎㅎ

    private String name;

    public 음식(String name) { // 생성자
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
