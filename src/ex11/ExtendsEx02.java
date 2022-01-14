package ex11;

class 동물 {

    int hp = 100;
    int attack;

    void name() {
    }

    void hurt() {
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int attack = 10;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다.");
    }

    void hurt() {
        System.out.println(hp);
    }
}

class 호랑이 extends 동물 {

    String name = "호랑이";
    int attack = 15;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다.");
    }

    void hurt() {
        System.out.println(hp);
    }

}

class 곰 extends 동물 {

    String name = "곰";
    int attack = 40;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다.");
    }

    void hurt() {
        System.out.println(hp);
    }
}

public class ExtendsEx02 {

    static void attack1(동물 unit1, 동물 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
    }

    static void start(동물 unit1, 동물 unit2) {
        unit2.name();
        unit2.hurt();
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        start(lion, tiger);
        start(tiger, bear);
        start(bear, lion);
    }
}