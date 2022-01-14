package ex07;

//1. 자바는 모든 코드가 class내부에 있어야한다. 
//2. 클래스 = 1급: 제일 밖에 존재할 수 있는 애들: 자바에서 class
//3 . 모든 클래스 = 설계도
//4. 클래스는 상태(변수)와 행위(메서드)를 가진다.
//5. static찾을 때 class명.변수명 으로 찾는다. (.은 연결연산자)
//6. static아닌 애들을 메모리에 띄우는 방법: new 클래스명()  - heap에 뜬다. 

class Juwon {
    int 배고픔 = 100; // 0~100: 100이 가장 배부름상태

    void 밥먹기() { // 메서드 = 행위
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Juwon abc = new Juwon();
        System.out.println(abc.배고픔);

        abc.밥먹기(); // 행위
        System.out.println(abc.배고픔);
    }
}
