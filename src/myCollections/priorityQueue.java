package myCollections;


import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Initial PriorityQueue: " + pq);

        
        System.out.println("Peek (head): " + pq.peek());

       
        System.out.println("Polling all elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

       
        System.out.println("Is the queue empty? " + pq.isEmpty());
    }
}