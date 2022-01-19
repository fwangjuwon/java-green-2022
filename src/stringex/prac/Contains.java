package stringex.prac;

// contains:두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
public class Contains {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "c";
        boolean contains = str1.contains(str2);
        System.out.println("contains: " + contains);
    }
}
