package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertEnd(int data) {
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

    
    public void displayIterative() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data );
            current = current.next;
        }
        System.out.println("null");
    }

   
    public void displayWithStack() {
        Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data);
        }
        System.out.println("null");
    }

   
    public void displayRecursive(Node node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        System.out.print(node.data );
        displayRecursive(node.next);
    }

  
    public void displayReverseUsingCollections() {
        ArrayList<Integer> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(current.data);
            current = current.next;
        }

        Collections.reverse(values);
        for (int val : values) {
            System.out.print(val );
        }
        System.out.println("null");
    }
}


public class LinkedListReversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        System.out.println("Iterative:");
        list.displayIterative();

        System.out.println("Recursive:");
        list.displayRecursive(list.head);

        System.out.println("Using Stack:");
        list.displayWithStack();

        System.out.println("Using Collections:");
        list.displayReverseUsingCollections();
    }
}
