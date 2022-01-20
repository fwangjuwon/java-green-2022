package ex11;

class 가구 {
    String name = "가구";

    가구() {
    }

    가구(int num) { // 뭔가 들고 있으면 디폴트 생성자가 아니므로 오류난다. 그럼 생성자 하나 더 만든다 > 디폴트 생성자로! 상속은 부모의 디폴트 생성자를
                  // 때린다.
        System.out.println("나 실행되니?");
    }
}

// 1. super는 부모의 heap, this는 자신의 heap
// 2. 자식을 new하면 자식의 생성자에 super(); 문장이 생략되어 있다. (상속의 관계일 때만!) (디폴트 생성자, 오버로딩 개념
// 다시 한번 탑재!)
class 침대 extends 가구 {
    String name = "침대";

    침대() { // 생성자
        super(1); // 가구 디폴트 생성자를 때리는거. 이거는 자동으로 생긴다. 그래서 위에서 오류난거다. 그래서 직접 적어주면 사라지므로 오류 안난다.
        System.out.println(super.name);
    }
}

// super = 부모, this = 본인자신의 힙메모리공간
public class SuperEx01 {
    public static void main(String[] args) {
        침대 s = new 침대();
    }
}
