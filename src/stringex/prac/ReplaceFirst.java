package stringex.prac;

// replaceFirst:문자열에 지정한 문자" "가 있으면 첫번째만 새로지정한 문자" "로 바꿔서 출력한다.
public class ReplaceFirst {
    public static void main(String[] args) {
        String str = "Aman";
        String replaceFirst = str.replaceFirst("A", "super");
        System.out.println("replaceFirst: " + replaceFirst);
    }
}
