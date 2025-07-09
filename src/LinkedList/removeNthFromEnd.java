package LinkedList;
public void removeNthFromEnd(int n) {
    Node dummy = new Node(0);
    dummy.next = head;
    Node fast = dummy, slow = dummy;

    // Move fast n+1 steps ahead
    for (int i = 0; i <= n; i++) {
        fast = fast.next;
    }

    // Move both until fast reaches end
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    // Remove the nth node
    slow.next = slow.next.next;

    // Update head in case the first node was removed
    head = dummy.next;
}



