package ex_07062024.aug24;

import java.util.PriorityQueue;

public class lab5 {
    public static void main(String[] args) {
        //queue FIFO
        PriorityQueue pq=new PriorityQueue();
        pq.offer("20");
        pq.offer("36");
        pq.offer("45");
        pq.offer("34");
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
