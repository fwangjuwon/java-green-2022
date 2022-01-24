package srp2;

public abstract class Customer {

    abstract void order(String menuName, Menu menu, Barista barista);
}

class 홍길동 extends Customer {

    private String name;

    홍길동(String name) {
        this.name = name;
    }

    @Override
    void order(String menuName, Menu menu, Barista barista) {

        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(name + "이 " + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다");

    }

}
