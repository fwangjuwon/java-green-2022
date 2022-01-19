package stringex.prac;

// compareTo:두개의 String를 앞에서부터 순사적으로 비교하다가 틀린부분이 있으면 비교하는 String에 캐릭터값을 반환한다.(대소문자를 구별)
public class CompareTo {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        int compareTo = str1.compareTo(str2);
        if (compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }
    }
}
