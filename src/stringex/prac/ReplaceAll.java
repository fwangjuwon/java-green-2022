package stringex.prac;

//replaceAll:정규표현식을 지정한 문자로 바꿔서 출력한다.
public class ReplaceAll {
    public static void main(String[] args) {
        String str = "AB CD";
        String replaceAll = str.replaceAll("\\p{Space}", "*");
        System.out.println("replaceAll: " + replaceAll);
    }
}
