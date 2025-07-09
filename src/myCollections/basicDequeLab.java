package myCollections;


import java.util.ArrayDeque;
import java.util.Deque;

public class basicDequeLab {
    public static void main(String[] args) {
       
        Deque<String> deque = new ArrayDeque<>();

        
        deque.addFirst("Asha"); 
        deque.addLast("Raj");    
        deque.offerFirst("Neha");
        deque.offerLast("Ravi");
        System.out.println("After adding elements: " + deque);

        
        System.out.println("Peek First: " + deque.peekFirst()); 
        System.out.println("Peek Last: " + deque.peekLast());   

        
        System.out.println("Remove First: " + deque.removeFirst()); 
        System.out.println("Remove Last: " + deque.removeLast());   
        System.out.println("After removals: " + deque);

        
        deque.push("Mango"); 
        System.out.println("After push: " + deque);
        System.out.println("Pop: " + deque.pop()); 
        System.out.println("After pop: " + deque);

        
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        
        System.out.println("Remaining elements:");
        for (String item : deque) {
            System.out.println(item);
        }
    }
}
