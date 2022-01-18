package ex11;

class 달리기선수 {
    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void runSpeed() {
        speed = speed + 20;
    }
}

public class AccessEx06 {
    public static void main(String[] args) {
        달리기선수 r1 = new 달리기선수();

        System.out.println("달리기 선수의 속도는 " + r1.getSpeed());

        r1.runSpeed();
        System.out.println("달리기 선수의 속도는 " + r1.getSpeed());

        r1.runSpeed();
        System.out.println("달리기 선수의 속도는 " + r1.getSpeed());
    }
}
