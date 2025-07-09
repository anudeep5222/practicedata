package myCollections;



import java.util.LinkedList;
import java.util.Queue;

public class BasicqueueLab {
    public static void main(String[] args) {
        // 1. Create a Queue
        Queue<String> queue = new LinkedList<>();

        // 2. Add elements (enqueue)
        queue.add("Asha");
        queue.add("Raj");
        queue.add("Neha");
        System.out.println("Initial queue: " + queue);

        // 3. Peek (see the head without removing)
        System.out.println("Peek: " + queue.peek());

        // 4. Remove elements (dequeue)
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);

        // 5. Add more elements
        queue.offer("Ravi"); // Similar to add(), but doesn't throw exception
        System.out.println("After offering Ravi: " + queue);

        // 6. Poll (remove head safely)
        System.out.println("Polled: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 7. Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 8. Loop through remaining elements
        System.out.println("Remaining elements in queue:");
        for (String name : queue) {
            System.out.println(name);
        }
    }
}
