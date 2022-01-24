package srp3;

public class 커피 {
    private String name;
    private int price;

    public 커피(메뉴아이템 menuitem) {
        this.name = menuitem.getName();
        this.price = menuitem.cost();
    }

    public String getName() {
        return name;
    }
}
