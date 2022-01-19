package stringex.prac;

//indexOf:지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
public class IndexOf {
    public static void main(String[] args) {
        String str = "abcdef";
        int indexOf = str.indexOf("a");
        System.out.println("indexOf: " + indexOf);
    }
}
