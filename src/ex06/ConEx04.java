package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if (조건): 그게 아니라 이것이라면
        int point = 51;
        if (point >= 90) {
            System.out.println("a학점");
        } else if (point >= 80) { // point가 80~89사이라면 (절차지향프로그램이라서)
            System.out.println("b학점");
        } else if (point >= 70) {
            System.out.println("c학점");
        } else if (point >= 60) {
            System.out.println("d학점");
        } else {
            System.out.println("f학점");
        }
    } // 메인 끝
}
