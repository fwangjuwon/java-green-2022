package ex11;

//패턴: 디자인 패턴  클래스라는 설계도로 도안을 짤거다. >설계도를 왜 패턴으로 만들까? 누구나 동일하게 만들 수 있으니까!
//싱글톤 패턴 배워보자 ㅎㅎ 

class 튜브 {
    private static 튜브 instance = new 튜브(); // static붙어 있으니까 미리 튜브 띄워놓는거.

    private 튜브() {
    }

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }
}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();

        System.out.println(t1.hashCode()); // t1과 t2 의 해쉬코드가 같다 : 같은 메모리 주소를 쓰고 있다는 뜻!! 하나밖에 메모리에 안 뜬다! new를 따로하면 해쉬코드가
                                           // 다르게 나오는 것을 확인할 수
                                           // 있다. 해쉬코드는 object라는 클래스가 갖고 있따. 튜븐 object의 자식, 자바의 모든 클래스는 object의 자식이다. >
                                           // 모든 클래스들이 쓸 수 있는 메소드를 갖고 있다. 오브젝트만 유일하게 다중상속할 수 있다.
        System.out.println(t2.hashCode());
    }
}
