package coffeeshop;

public class Consumer {
    public void 주문(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.메뉴선택(menuName);

        if (menuItem == null) {
            System.out.println(menuName + "은 우리 커피숍에 없습니다");
        } else {
            Coffee coffee = barista.커피생성(menuItem);
            System.out.println("커피 나왔습니다.");
            System.out.println(coffee.getName());
            System.out.println(coffee.getPrice());
        }
    }
}
