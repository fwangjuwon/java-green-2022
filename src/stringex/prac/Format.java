package stringex.prac;

//format:서식문자열을 이용해서 서식화된 문자열을 반환한다.
public class Format {
    public static void main(String[] args) {
        int i = 123456789;
        String str = String.format("%,d", i);
        System.out.println("format: " + str);
    }
}
