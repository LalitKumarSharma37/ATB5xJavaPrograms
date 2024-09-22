package src.collection_3_F;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab194 {

    public static void main(String[] args) {
       Queue pq1 = new PriorityQueue();
        // FIFO -> 1 -> BOARD THE PLANE, Train
        // A, B, C -> A, B, c

        // Offer - work as Add
        // PQ  -> Sorted in nature

        pq1.offer(20);
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(40);
      //  pq1.offer(null);

        pq1.add(90);



        System.out.println(pq1);
//        System.out.println(pq1.poll()); //poll() remove the 1st element from array
//        System.out.println(pq1);
//        System.out.println(pq1.peek()); //Use for display 1st element

    }
}
