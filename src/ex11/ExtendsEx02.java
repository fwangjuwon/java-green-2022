package ex11;

class 동물 {
    int hp;
    int attack;
    int newhp;

    void name() {
    }

    void newHp() {
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
    int newhp;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다. 초기 hp는" + hp + "입니다");
    }

    void newHp() {
        System.out.println("새로운 hp=" + newhp);
    }

}

class 호랑이 extends 동물 {

    String name = "호랑이";
    int hp = 100;
    int attack = 15;
    int newhp;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다.초기 hp는" + hp + "입니다");
    }

    void newHp() {
        System.out.println("새로운 hp=" + newhp);
    }

}

class 곰 extends 동물 {

    String name = "곰";
    int hp = 100;
    int attack = 40;
    int newhp;

    void name() {
        System.out.println(this.name + "가 공격당하고 있습니다. 초기 hp는" + hp + "입니다");
    }

    void newHp() {
        System.out.println("새로운 hp=" + newhp);
    }
}

public class ExtendsEx02 {

    static void start(동물 unit1, 동물 unit2) {

        unit2.name();
        unit2.newhp = unit2.hp - unit1.attack;
        unit2.newHp();
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        start(bear, lion);
        start(lion, tiger);
        start(tiger, bear);
    }
}
