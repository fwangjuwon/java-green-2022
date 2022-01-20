package ex11;

class 엔진 {
    int power = 5000;
}

// data 재사용하는 방법 > 의존관계 생성
// has관계를 만드는 법 = composition
// 생성자로 주입받기

class 소나타 {

    // has관계! 변수를 갖고 있다. > 소나타는 엔진에 의존적이다! (동일한 관계가 아니다. 소나타 입장에서 엔진을 갖고 있다) <> is관계
    // 구체적인 것에 의존한고 있는 것을 강한 결합이라고 한다.
    // 추상적인 것에 의존하고 있는 것을 느슨한 결합이라고 한다 > 코드 수정 필요없다.
    엔진 engine; // null

    소나타(엔진 engine) { // 생성자가 받아줘야되 내가 가져야 할 것을!!
        this.engine = engine;

    }
}

public class CompositeEx01 {
    public static void main(String[] args) {

        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);

    }
}
