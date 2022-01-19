package srp;

public class 요리사 {

    public 음식 음식생성() { // 요리사는 어디에도 의존적이지 않음 협력의 관계가 없다. 종업원이 호출해주면 그만이니까 . 생성해서 리턴만 하면 됨 (주소가 없는
                       // 이유-받을게 없다 )
        음식 jjajang = new 음식("짜장면");

        return jjajang;
    }
}
