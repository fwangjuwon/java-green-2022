package ex07;

/**
 * oop문법
 * 클래스 내부의 변수(상태)는 선언만 한다! 초기화 안한다.
 */

class 사람 {
    String name;
    int heignt;
    int weight;
}

public class OOPEx06 {
    public static void main(String[] args) {
        사람 s1 = new 사람();
        s1.name = "차은우";
        s1.heignt = 183;
        s1.weight = 75;
        System.out.println("사람1번 이름은 " + s1.name + " 키는 " + s1.heignt + " 몸무게는 " + s1.weight);

        사람 s2 = new 사람();
        s2.name = "서강준";
        s2.heignt = 180;
        s2.weight = 77;
        System.out.println("사람2번 이름은 " + s2.name + " 키는 " + s2.heignt + " 몸무게는 " + s2.weight);

        사람 s3 = new 사람();
        s3.name = "공명";
        s3.heignt = 190;
        s3.weight = 80;
        System.out.println("사람3번 이름은 " + s3.name + " 키는 " + s3.heignt + " 몸무게는 " + s3.weight);
    }
}
