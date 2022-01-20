package stringex;

import java.util.Scanner;

//6. 클래스로 옮겨 담기 위한 클래스 생성!
class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A01-이름:홍길동-전번:2032030-성별:여-나이: 21
        String data = sc.nextLine();
        // String data = "A01-이름:홍길동-전번:2032030-성별:여-나이: 21"; // 넣어서 테스트하자. 위에껀 주석처리해놓고.

        String tokens[] = data.split("-");
        // System.out.println(tokens[0]); //스플릿 잘 됏는지 확인하고 주석!!
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        // System.out.println(tokens[3]);
        // System.out.println(tokens[4]);

        if (tokens[0].equals("A01")) {
            // 진행해보자. 1. 이름:홍길동 을 :으로 구분해서 홍길동을 찾자!
            String name = tokens[1].split(":")[1];
            // 확인: f5 로 디버깅확인!!

            // 2. 전번:2032030 을 :으로 구분해서 2032030을 찾자
            String tel = tokens[2].split(":")[1];

            // 3. 성별:여 를 :으로 구분해서 여를 찾자
            String genderTemp = tokens[3].split(":")[1];

            // 4 나이: 21을 :로 구분해서 21을 찾자 그런데 띄어쓰기 있으니까 주의!!
            String ageTemp = tokens[4].split(":")[1];

            // 5. char, int로 담는 형변환하기
            char gender = genderTemp.charAt(0);
            // 공백처리먼저!!
            String ageTrim = ageTemp.trim();
            int age = Integer.parseInt(ageTrim);

            // 6. class로 옮겨 담기

            User user = new User(
                    name,
                    tel,
                    gender,
                    age); // class가 있으면 뉴 할 때, 소문자로 하는게 규칙 ㅎㅎ

            System.out.println("end if");

        } else {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
