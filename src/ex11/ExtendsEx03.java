package ex11;

class 애완동물 {
    void sound() {
    }

    void printName() {
    }

    void changeName() {
    }

}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void sound() {
        System.out.println("야옹");
    }

    void printName() {
        System.out.println(name);
    }

    void changeName() {
        name = "변경된 고양이";
    }

}

public class ExtendsEx03 {
    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.changeName();
        u1.printName();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이(); // 얘는 부모랑 같은 메소드 갖고 있어서 오버라이드 된거고
        start(cat);

        애완동물 dog = new 강아지(); // 얜 부모랑 같은 메소드 안 갖고 있어서 오버라이드 안 된거다.
        start(dog);
    }
}
