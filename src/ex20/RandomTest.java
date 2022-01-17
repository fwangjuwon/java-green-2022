package ex20;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(100)); // 0에서 100까지의 난수를 발생시킨다.

        // boolean형 난수 추출
        boolean ranBool = random.nextBoolean();
        System.out.println("booelan형 : " + ranBool);

        // int형 난수 추출(-2,147,483,648 ~ 2,147,483,647)
        int ranInt1 = random.nextInt();
        System.out.println("int형 (범위x) : " + ranInt1);

        // long형 난수 추출
        long ranLong = random.nextLong();
        System.out.println("long형 : " + ranLong);

        // int형 난수 추출(0~9)
        int ranInt2 = random.nextInt(10);
        System.out.println("int형 (0~9) : " + ranInt2);

        // float형 난수 추출 float형의 0.0과 1.0 사이의 난수를 발생한다.
        float ranFloat = random.nextFloat();
        System.out.println("float형 : " + ranFloat);

        // nextGaussian형 난수 추출 평균이 0.0이고 표준편차가 1.0인 가우시안 분포에서 다음 난수를 발생시킨다.
        double nextG = random.nextGaussian();
        System.out.println(nextG);

        // double형 난수 추출 double형의 0.0과 1.0 사이의 난수를 발생한다.
        double ranDouble = random.nextDouble();
        System.out.println("double형 : " + ranDouble);
    }
}
