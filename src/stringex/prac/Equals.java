package stringex.prac;

//equals:두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
public class Equals {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        boolean equals = str1.equals(str2);
        System.out.println("equals: " + equals);
    }
}
