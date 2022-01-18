package training;

class Employee {
    public String name;
    String address;
    protected int salary;
    private int RRN;

    public String toString() {
        return name + "," + address + "," + RRN + "," + salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public void printSalary() {
        System.out.println(name + "(" + address + ")" + (salary + bonus));
    }

    public void printRRN() {
        // System.out.println(RRN); //private 라서 접근할 수 없다. Employee를 상속받아서 Manager클래스를
        // 정의하였다. Manager 클래스에서는 name, address, salary 필드를 접근할 수 있다. 하지만 RRN필드는 private로
        // 선언되어서 Manager 클래스에서는 접근이 불가능하다. 정리하면 서브크래스는 수퍼클래스에서 정의된 멤버 중에서 private를 제외한
        // 나머지 멤버들은 모두 접근 가능하다. 메소드에 대해서도 마찬가지다. 수퍼 클래스에서 private로 정의된 메소드는 서브 클래스에서 접근할
        // 수 없지만, 나머지 메소드들은 얼마든지 사용 가능하다.
    }
}

public class ManagerTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.printRRN();
    }
}
