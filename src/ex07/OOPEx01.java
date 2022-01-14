package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new 는 heap에 할당하라는 키워드
        // car클래스가 갖고 있는 static이 아닌 모든 것들이 heap에 뜬다. (static안붙어있는 것들만)
        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car();

    }

}
