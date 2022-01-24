package srp3;

public class 손님 {
    public void order(String menuName, 메뉴판 menu, 바리스타 barista) {
        메뉴아이템 menuitem = menu.choose(menuName);
        커피 coffee = barista.makecoffee(menuitem);

    }

    String name = "홍길동";

}
