package stringex.prac;

//split:지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
public class Split {
    public static void main(String[] args) {
        String str = "A:B:C:D:abcd";
        String[] split = str.split(":");
        System.out.println("split: " + split[1]);
    }
}
