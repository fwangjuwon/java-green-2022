package ex10;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 }; // 이 문장은 상당히 많은 작업을 한다. 먼저 배열 차모 변수를 선언하고 배열을 생성하며
        // 주어진 초기 값을 배열 원소에 저장한다. 이 경우 new를 사용하여 생성하지 않아도 주어진 초기값 개수만큼의 배열이 자동적으로 생성된다.
        for (int i = 0; i < numbers.length; i++) { // numbers.length; 각 배열은 length라는 필드를 갖고 있따. length필드는 배열의 크기를 나타낸다.
            // 따라서 이것을 이용하면 배열의 크기만큼 반복을 시킬 수 있다.
            System.out.println(numbers[i]);
        }
    }
}
