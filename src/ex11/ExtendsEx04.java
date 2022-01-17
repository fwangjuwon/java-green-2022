package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자 나는 팀장
 * 신입이 실수하면 내 책임이니까 ㅎㅎ
 */

// abstract class = 추상클래스 > 구체적인 실행은 자식들이 해야된다.
// ㄱ. new할 수 없다! ㄴ. 추상메서드를 만들 수 있다. (몸체{} 없이 만들 수 있따) > 메소드 앞에도 abstract붙여야 한다 >
// 구체적인 행위는 자식한테 맡기겠다. 자식한테 위임한다 (실제로 메모리에 뜰 수 있는 애들)
// ex- 동물을 추상화하고 독수리와 사자를 상속시키면, 메소드를 run()으로 해도 독수리는 날고, 사자는 뛰니까 그런 구체적인 행위는
// 자식에게 맡기겠따는 뜻이다.
// 추상클래스는 일반 메서드도 가질수는 있따. (ex- 모든 구체적인 애들의 공통적인 행위들 먹는것 이런것)
// 추상메서드 - 객체의 행위를 공통적으로 정의할 수 없을 때: 어짜피 통로로만 쓸건데, 구체적인 행위는 적기 귀찮다.
// 일반 메서드 - 객체의 행위를 공통적으로 정의할 수 있을 때

abstract class ProtossUnit { // 종족 이름
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

// 일반 클래스는 추상 메서드를 가질 수 없다. 구체적으로 행위를 지정해줘야한다.
// 이 클래스를 new하면, 구체적인 행위가 없어서 new가 안된다. (추상적이지 않으니까)
// 그래서 이 클래스는 메소드 3개를 직접 구현해야한다. > new가능
// 장점: 신입이 절대 실수 안함. > abstract를 만드는 순간 강제성이 부여된다.
class Zealot extends ProtossUnit { // 근거리 공격
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

// 신입아, darktemplere하나 만들어
// name = 다크템플러 hp =100, attack =50
// 꼭 protossunit으로 추상화해야되
// test: 다크템플러가 질럿을 공격

class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {

        return hp;
    }

    @Override
    int getAttack() {

        return attack;
    }

}

class Dragon extends ProtossUnit { // 원거리 공격
    String name = "드라곤";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

public class ExtendsEx04 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격해야함 > u2의 hp = u2의 hp- u1의 attack 을 u2의 hp에 넣어줘야함 > 자식변수에 접근 안되군
        // > 오버라이드!! 해야겟당

        u2.setHp(u2.getHp() - u1.getAttack());

        // 2. u2의 hp를 출력해야됨 - sysout u2.hp

        System.out.println(u2.getHp());
        // 3. hp는 찾아서 변경해야됨 > u2.hp를 변경하는 메소드 하나(return 필요없다, 하지만 매개변수는 필요하다 뭘로 받아야하니) +
        // u2.hp에 접근하는 메소드 하나 (새로운 값을 출력해야하니 return해야됨)
        // 4. attack은 찾기만 하면된다. > u1.attack에 접근하는 메소드 하나 (값을 출력해야하니 return필요하다)
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragon();
        ProtossUnit t1 = new DarkTempler();

        attack(z1, d1);
        attack(d1, z1);
        attack(t1, z1);
    }
}
