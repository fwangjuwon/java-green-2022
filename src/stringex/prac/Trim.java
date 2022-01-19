package stringex.prac;

//trim:문자열에 공백을 없에준다.
public class Trim {
    public static void main(String[] args) {
        String s = "     java java java     ";
        String v;
        v = s.trim();
        System.out.println("trim:" + v);
    }
}
