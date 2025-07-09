package LinkedList;


public class LinkedListQueue {

    private static class Node {

        int data;

        Node next;

 

        public Node(int data) {

            this.data = data;

            this.next = null;

        }

    }

 

    private Node front;

    private Node rear;

    private int size;

 

    public LinkedListQueue() {

        this.front = null;

        this.rear = null;

        this.size = 0;

    }

 

    

    public void enqueue(int item) {

        Node newNode = new Node(item);

        if (isEmpty()) {

            front = rear = newNode;

        } else {

            rear.next = newNode;

            rear = newNode;

        }

        size++;

    }

 

    

    public int dequeue() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue is empty");

        }

        int item = front.data;

        front = front.next;

        if (front == null) {

            rear = null;

        }

        size--;

        return item;

    }

 

   

    public int peek() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue is empty");

        }

        return front.data;

    }

 

    

    public boolean isEmpty() {

        return front == null;

    }

 

    

    public int size() {

        return size;

    }

 

    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        

        queue.enqueue(10);

        queue.enqueue(20);

        queue.enqueue(30);

        

        System.out.println("Front element: " + queue.peek()); // 10

        System.out.println("Queue size: " + queue.size());    // 3

        

        System.out.println("Dequeued: " + queue.dequeue());   // 10

        System.out.println("Dequeued: " + queue.dequeue());   // 20

        

        queue.enqueue(40);

        queue.enqueue(50);

        

        while (!queue.isEmpty()) {

            System.out.println("Dequeued: " + queue.dequeue());

        }

        
    }

}