package myCollections;




import java.util.ArrayDeque;
import java.util.Deque;

public class arrayQueueLab {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Queue operations (FIFO)
        deque.offer("Asha");
        deque.offer("Raj");
        deque.offer("Neha");
        System.out.println("Queue style: " + deque);  // [Asha, Raj, Neha]

        // Examine elements from both ends
        System.out.println("Peek first: " + deque.peekFirst()); // Asha
        System.out.println("Peek last: " + deque.peekLast());   // Neha

        // Remove elements from both ends
        System.out.println("Removed first: " + deque.pollFirst()); // Asha
        System.out.println("Removed last: " + deque.pollLast());   // Neha
        System.out.println("After removals: " + deque);            // [Raj]

        // Stack operations (LIFO using push/pop)
        deque.push("Mango");   // adds to front
        deque.push("Apple");
        System.out.println("Stack style: " + deque);  // [Apple, Mango, Raj]

        System.out.println("Popped: " + deque.pop()); // Apple
        System.out.println("After pop: " + deque);    // [Mango, Raj]
    }
}
