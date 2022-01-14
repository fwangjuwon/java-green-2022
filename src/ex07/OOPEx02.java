package ex07;

class Doctor {
    int sal = 5000;
    String name = "홍길동";
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor abc = new Doctor();
        System.out.println(abc.sal);
        System.out.println(abc.name);
    }
}
