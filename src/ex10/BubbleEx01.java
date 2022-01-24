package ex10;

public class BubbleEx01 {
    public static void main(String[] args) {

        int[] data = { 9, 6, 3, 5, 1 };

        for (int i = 0; i < data.length - 1; i++) {

            for (int j = 0; j < data.length - 1 - i; j++) { // 배열을 순차탐색 하여, i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동시킨다.
                if (data[j] > data[j + 1]) { // 다음 탐색부터는 마지막 요소는 안해도 됨. 그래서 내부에 있는 for문은 arr.length-i 까지만 탐색한다.
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
            ShowArray(data); // 현재 i번째 데이터 출력
        }

        System.out.println("\r\n/////////////bubble sort 결과");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println();
    }

    private static void ShowArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println();
    }
}
