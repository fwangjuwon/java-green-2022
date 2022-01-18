package ex12;

//3번. 인터페이스 만들기 
interface Keymap {
    // 추상 메소드 정의 - 시그니처만 존재하고, 몸체가 없다. 인터페이스 안에서 선언되는 메소드들은 모두 묵시적으로 public,
    // abstract 이다.
    public abstract void q();

    public abstract void w();

    public abstract void e();

    public abstract void r();
}

// 4번. 알리스타 클래스 생성
class 알리스타 implements Keymap { // 인터페이스 구현 (implements Keymap)

    @Override
    public void e() {
        // 실제로 e의 행위를 위한 코드가 들어간다.
        System.out.println("스턴걸");
    }

    @Override
    public void q() {
        // TODO Auto-generated method stub
        System.out.println("띄우기");
    }

    @Override
    public void r() {
        // TODO Auto-generated method stub
        System.out.println("방어력증가");
    }

    @Override
    public void w() {
        // TODO Auto-generated method stub
        System.out.println("밀기");
    }

}

// 5번 티모 클래스 생성
class 티모 implements Keymap {

    @Override
    public void e() {
        // TODO Auto-generated method stub
        System.out.println("맹독발사");
    }

    @Override
    public void q() {
        // TODO Auto-generated method stub
        System.out.println("실명");
    }

    @Override
    public void r() {
        // TODO Auto-generated method stub
        System.out.println("버섯폭탄");
    }

    @Override
    public void w() {
        // TODO Auto-generated method stub
        System.out.println("이속증가");
    }

}

// 1번. 클래스 생성
public class TestEx01 {

    // 2번. main 메서드 생성
    public static void main(String[] args) {

        // 6번. 인터페이스 구현 & 발현
        Keymap u1 = new 알리스타(); // 인터페이스는 클래스가 아니므로 new 연산자를 할 수 없다.
        Keymap u2 = new 티모(); // 하지만 자식클래스를 통해서는 new를 할 수 있다. > 메모리에 keymap도뜨고, 알리스타도 뜨고!!

        u1.q();
        u1.w();
        u1.e();
        u1.r();
        u2.q();
        u2.w();
        u2.e();
        u2.r();
    }
}
