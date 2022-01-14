package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임(500,100,50,10)
        int money = 8920; // 500*5, 100*1, 50*1, 10*3
        int restMoney = money; // call by value
        int coin;

        // 1. 500원 동전 구하기
        coin = 500;
        System.out.println(coin + "원: ");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin; // 180이 나온다. 결국 restMoney=180 이 되어서 대입된다.

        // 2. 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원: ");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin; // 80이 나온다.

        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원: ");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;

        // 4. 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원: ");
        System.out.println(restMoney / coin + "개");

    }
}
