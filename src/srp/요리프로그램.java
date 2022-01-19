package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사(); // 이 세가지는 개발자가 만들어야 한다. 메인에서

        customer.주문하기(manager, chef); // 프로그램이 시작되는 것! 이것도 개발자가 해야된다.
        // 손님과 종업원이 의존적이게 됨. 손님은 요리사와 의존하지 않지만 main에서 다 띄웠기 떄문에, chef도
        // 의존해야된다 어쩔 수 없이. 그래서 손님에 가서도 의존해줘야한다.

        customer.주문하기(manager, chef);
        customer.주문하기(manager, chef);
    }
}
