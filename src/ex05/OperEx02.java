package ex05;

import javax.sql.rowset.spi.SyncResolver;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(!(1 == 1));
        System.out.println(!true);
        System.out.println(!true == true); // 괄호는 우선순위 지정할 수 있다!!!
        System.out.println(1 != 1); // != 은 같지 않냐고 물어보는 것
        System.out.println(1 < 2); // 1은 2보다 작나요?
        System.out.println(1 > 2); // 1은 2보다 크나요?
    }

}
