package ex07;

class Person3 {
    int height;
    int weight;
    String name;

    // 디폴트 생성자 = 클래스명 (){}
    Person3(String d1, int d2, int d3) { // person2 스택에 변수 3개가 뜬다. 하나씩 꺼내서 쓴다.
        name = d1;
        height = d2;
        weight = d3; // heap에 옮겨 놓는다.
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 80);
        Person3 s2 = new Person3("임꺽정", 180, 90);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}