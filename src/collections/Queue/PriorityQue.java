package collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(12);
        pq.offer(3);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
