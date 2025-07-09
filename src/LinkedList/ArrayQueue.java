package LinkedList;


public class ArrayQueue {

    private int[] queue;

    private int front;

    private int rear;

    private int size;

    private int capacity;

 

    public ArrayQueue(int capacity) {

        this.capacity = capacity;

        this.queue = new int[capacity];

        this.front = 0;

        this.rear = -1;

        this.size = 0;

    }

 

    

    public void enqueue(int item) {

        if (isFull()) {

            throw new IllegalStateException("Queue is full");

        }

        rear = (rear + 1) % capacity;

        queue[rear] = item;

        size++;

    }

 

    

    public int dequeue() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue is empty");

        }

        int item = queue[front];

        front = (front + 1) % capacity;

        size--;

        return item;

    }

 

    

    public int peek() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue is empty");

        }

        return queue[front];

    }

 

    

    public boolean isEmpty() {

        return size == 0;

    }

 

    

    public boolean isFull() {

        return size == capacity;

    }

 

    

    public int size() {

        return size;

    }

 

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        

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