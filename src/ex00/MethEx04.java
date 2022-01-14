package ex00;

/**
 * 오버로딩: over loading = 과적재
 */

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자 -> 호랑이 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자 -> 곰 공격
    static void attackLionToBear(사자 unit1, 곰 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 사자 공격
    static void attackTigerToLion(호랑이 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 곰 공격
    static void attackTigerToBear(호랑이 unit1, 곰 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 사자 공격
    static void attackBearToLion(곰 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 호랑이 공격
    static void attackBearToTiger(곰 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있어요.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자 lion1 = new 사자();
        호랑이 tiger1 = new 호랑이();
        곰 bear1 = new 곰();

        attackLionToTiger(lion1, tiger1);
        attackLionToBear(lion1, bear1);
        attackTigerToLion(tiger1, lion1);
        attackTigerToBear(tiger1, bear1);
        attackBearToLion(bear1, lion1);
        attackBearToTiger(bear1, tiger1);
    }
}
