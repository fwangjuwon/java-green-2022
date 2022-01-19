package stringex.prac;

// endWith:문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
public class EndWith {
    public static void main(String[] args) {

        String str = "test";
        boolean endsWith = str.endsWith("t");
        System.out.println("endsWith: " + endsWith);

    }
}
