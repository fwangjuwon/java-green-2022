package ex22;

import java.util.PriorityQueue;

public class CollectionEx07 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // 우선순.위 큐 생성
        pq.add(30);
        pq.add(50);
        pq.add(70);

        for (Integer o : pq)
            System.out.println(o);
        System.out.println("원소 삭제");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
