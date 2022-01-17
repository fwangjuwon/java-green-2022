package ex11;

class 동물 {

    String getName() {
        return "";
    }

    void setHp(int hp) {
    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }

}

class 사자 extends 동물 {

    String getName() {
        return name;
    }

    void setHp(int hp) { // 매개변수로 쓰는 int hp는 스택이 들고 있다.
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

    String name = "사자";
    int hp = 100;
    int attack = 10;

}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 100;
    int attack = 30;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }

}

public class ExtendsEx02 {
    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격

    static void attack(동물 u1, 동물 u2) {

        System.out.println(u2.getName() + "이" + u1.getName() + " 에게공격당하고 있습니다.");
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getName() + "의 hp : " + u2.getHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 woolf = new 늑대();

        attack(lion, tiger);
        attack(bear, lion);
        attack(tiger, bear);
        attack(woolf, lion);
    }
}