package LinkedList;

public class linkedlist {

    Node head;

    public linkedlist() {
        this.head = null;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtBeginning(33);
        list.insertAtBeginning(44);
        list.insertAtBeginning(11);

        list.printList();

        list.insertAtPosition(55, 1);
        list.insertAtPosition(66, 0);
        list.insertAtPosition(22, 2);

        list.printList();

        list.deleteByPosition(2);
        list.printList();

        list.deleteByValue(66);
        list.printList();
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid operation");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Out of Bound");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteByValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void deleteByPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid condition");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bound");
            return;
        }

        current.next = current.next.next;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
