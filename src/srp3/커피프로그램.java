package srp3;

public class 커피프로그램 {
    private static String menuName;

    public static void main(String[] args) {
        손님 customer = new 손님();
        바리스타 barista = new 바리스타();
        메뉴판 menu = new 메뉴판(null);

        customer.order(menuName, menu, barista);
    }
}
