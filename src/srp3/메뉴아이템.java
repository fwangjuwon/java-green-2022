package srp3;

public class 메뉴아이템 {

    private String name = "아메리카노";
    private int price = 1500;

    public 메뉴아이템(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int cost() {
        return price;
    }

    public String getName() {
        return this.name;
    }
}
