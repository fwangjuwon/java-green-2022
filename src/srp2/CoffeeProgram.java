package srp2;

import java.util.ArrayList;
import java.util.List;

public class CoffeeProgram {
    public static void main(String[] args) {

        Customer customer = new 홍길동("홍길동");
        Barista barista = new 공유();

        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2500);
        MenuItem m3 = new MenuItem("녹차라떼", 3500);
        MenuItem m4 = new MenuItem("돌체라떼", 4500);
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        customer.order("아메리카노", menu, barista);

    }
}
