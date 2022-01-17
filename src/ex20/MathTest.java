package ex20;

import javax.sql.rowset.spi.SyncResolver;

public class MathTest {

    public static void main(String[] args) {

        double a = Math.E; // 자연 로그의 밑수
        System.out.println(Math.E);

        double x = Math.PI; // 파이값
        System.out.println(Math.sin(x));
        System.out.println(Math.random());

        double b = Math.abs(a); // 절대값
        System.out.println(Math.abs(-3.2));

        double c = Math.acos(a); // arc cosine, 반환값 범위는 0.0~pi
        System.out.println(Math.acos(35.0));

        double d = Math.asin(a); // arc sine, 반환값 범위는 -pi/2 에서 pi/2
        System.out.println(Math.asin(24.3));

        double e = Math.atan(a); // arc tangent, 반환값 범위는 -pi/2 에서 pi/2
        System.out.println(Math.atan(35.0));

        double f = Math.atan2(a, b); // 직교 좌표계를 극 좌표계로 변환할 때 theta를 변환
        System.out.println(Math.atan2(30, 20));

        double g = Math.cos(a); // cosine
        double h = Math.cosh(a); // hyperbolic cosine
        double i = Math.exp(a); // e의 a승
        double j = Math.hypot(a, b); // sqrt (a제곱 + b제곱)
        double k = Math.log(a); // natural logarithm (base e)
        double l = Math.log10(a); // base 10 logarithm
        double m = Math.max(a, b); // 큰 수
        double n = Math.pow(a, b); // a의 b승
        double o = Math.min(a, b); // 작은 수
        double p = Math.sin(a); // 0.0과 1.0 사이의 난수를 반환
        double q = Math.sinh(a); // sine
        double r = Math.sqrt(a); // hyperbolic sine
        double s = Math.tan(a); // 제곱근
        double t = Math.tanh(a); // hpyerbolic tangent
        double u = Math.toDegrees(a); // 라디안을 디그리로 변환
        double v = Math.toRadians(a); // 디그리를 라디안으로 변환

    }

}
