package stringex.prac;

// valueOf:지정한 개체의 원시 값을 반환
public class ValueOf {
    public static void main(String[] args) {
        int i = 12345;
        long l = 1L;
        char c = '1';
        System.out.println("valueOf: " + String.valueOf(i));
        System.out.println("valueOf: " + String.valueOf(l));
        System.out.println("valueOf: " + String.valueOf(c));
    }
}
