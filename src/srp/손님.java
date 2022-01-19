package srp;

// 손님 - 종업원 관계 (dependency 서로 의존성을 가짐 손님이 종업원을 호출하니까, 손님이 종업원의 주소reference를 알아야됨!!)
public class 손님 {

    public void 주문하기(종업원 manager, 요리사 chef) { // 힙을 가리키는 주소: 종업원 manager, 요리사 chef(main에 떴기 때무네 어쩌 수 없다)
        음식 jjajang = manager.주문받기(chef); // 주문받기를 호출한다. 매니저가 필요하다. chef를 넘기는 이유: 종업원과 요리사가 관계하니까
        System.out.println(jjajang.getName() + "을 먹습니다.");
    } // 주문받기가 끝나고 stack이 끝난다. 먼저들어온놈이 젤 나중에 나간다.

}
