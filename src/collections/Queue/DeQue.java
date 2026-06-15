package collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue {
    public static void main(String args[]) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(5);
        dq.addFirst(6);
        dq.addLast(10);
        dq.addLast(1);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.poll());
        System.out.println(dq.poll());
        dq.remove(1);
        System.out.println(dq);
    }
}
