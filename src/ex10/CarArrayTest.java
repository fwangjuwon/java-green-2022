package ex10;

class Car {
    public int speed;
    public int gear;
    public String color;

    public Car() {
        speed = 0;
        gear = 1;
        color = "red";
    }

    public void speedUp() {
        speed += 10;
    }

    public String toString() {
        return "속도:" + speed + "기어:" + gear + "색상" + color;
    }
}

public class CarArrayTest {
    public static void main(String[] args) {
        final int NUM_CARS = 5;
        Car[] cars = new Car[NUM_CARS]; // 배열 객체 생성
        for (int i = 0; i < cars.length; i++)
            cars[i] = new Car(); // 배열의 각 원소에 car객체를 생성하여 대입
        for (int i = 0; i < cars.length; i++)
            cars[i].speedUp();
        for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);
    }
}
