package srp;

//종업원 - 요리사 (종업원이 요리사를 호출해야됨 - 요리사의 주소를 알아야한다)
public class 종업원 {

    // 음식 s; = 음식 s=null;

    public 음식 주문받기(요리사 chef) { // 종업원은 요리사에 의존적이니까 주소가 필요함.
        음식 jjajang = chef.음식생성(); // 메세지 전달
        return jjajang; // null = 아무것도 없다. c는 음식이 만들어진 주소
    }
}
