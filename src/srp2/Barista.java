package srp2;

public abstract class Barista {
    abstract Coffee makeCoffee(MenuItem menuItem);
}

class 공유 extends Barista {

    private String name;

    공유(String name) {
        this.name = name;
    }

    @Override
    Coffee makeCoffee(MenuItem menuItem) {

        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}
