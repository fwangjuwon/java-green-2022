package stringex.prac;

//lastindexOf:문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
public class LastindexOf {
    public static void main(String[] args) {
        String str = "AdnroidApp";
        int lastIndexOf = str.lastIndexOf("A");
        System.out.println("lastIndexOf:" + lastIndexOf);

    }
}
