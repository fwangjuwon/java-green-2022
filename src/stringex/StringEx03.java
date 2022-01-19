package stringex;

import java.util.Scanner;

class 회원정보 {
    private String name;
    private String tel;
    private char gender1;
    private int age;

    public 회원정보(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender1 = gender;
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
        return gender1;
    }

    public void setGender(char gender1) {
        this.gender1 = gender1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine().trim();
        System.out.println("전송된 데이터: " + data);

        data = data.replace(':', '-');

        String[] tokens = data.split("-");

        String name = tokens[2];

        String tel = tokens[4];
        String gender = tokens[6];
        char gender1 = gender.charAt(0);
        int age = Integer.parseInt(tokens[8]);

        회원정보 inform = new 회원정보(
                name, tel, gender1, age);

        System.out.println(inform.getGender());
        System.out.println(inform.getAge());
        System.out.println(inform.getName());
        System.out.println(inform.getTel());
    }
}
