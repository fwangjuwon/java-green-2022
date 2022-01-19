package stringex.prac;

//startWith: 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
public class StartWith {
    public static void main(String[] args) {
        String str = "apple";
        boolean startsWith = str.startsWith("a");
        System.out.println("startsWith: " + startsWith);
    }
}
