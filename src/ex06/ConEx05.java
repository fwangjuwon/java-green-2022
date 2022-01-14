package ex06;

public class ConEx05 {
    public static void main(String[] args) {
        int point = 41;
        if (point >= 90) {
            System.out.println("A학점임다");
        } else {
            if (point >= 80) {
                System.out.println("B학점임다");
            } else {
                if (point >= 70) {
                    System.out.println("C학점임");
                } else {
                    if (point >= 60) {
                        System.out.println("D학점임");
                    } else {
                        System.err.println("F학점임");
                    }
                }
            }
        }
    }
}