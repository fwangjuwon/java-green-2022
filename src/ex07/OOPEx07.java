package ex07;

class Person {
    int height;
    int weight;
    String name;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 디폴트 생성자 = 클래스명 (){}
    // 왜 자동으로 만들어줄까?
    // 무조건 필요하니까, 맨날 적어주기 귀찮아서 자동으로 만들어진다.
    // 디폴트 생성자 = 객체의 초기화를 위해 필요하다. 안만들면, 초기화 못한다. 내가 만들지 않으면, 만들어준다.
    // 내가 클래스만들 때마다, 맨날 디폴트 생성자 해줘야됨 > 알아서 컴파일러가 해준거.
    // new할 때 실행된다.

    Person() {
        System.out.println("사람이 생성되었습니다");
        name = "황주원";
        height = 160;
        weight = 50;
    }
}

// 생성자
public class OOPEx07 {
    public static void main(String[] args) {
        Person s1 = new Person();
        System.out.println(s1.height);
    }
}
