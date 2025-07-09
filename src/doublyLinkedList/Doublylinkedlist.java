package doublyLinkedList;



public class Doublylinkedlist<T> {

	Node<T> head;
	Node<T> tail;
	int size;

	public Doublylinkedlist() {
	        this.head = null;
	        this.tail = null;
	        this.size = 0;
	    }

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public T removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			throw new IndexOutOfBoundsException();
		}
		T data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		} else {
			head.prev = null;
		}
		size--;
		return data;
	}

	public T removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			throw new IndexOutOfBoundsException();
		}
		T data = tail.data;
		tail = tail.prev;
		if (tail == null) {
			head = null;
		} else {
			tail.next = null;
		}
		size--;
		return data;
	}

	public void insertAt(T data, int position) {
		if (position < 0 || position > size) {
			System.out.println("Index out of bound");
			throw new IndexOutOfBoundsException();
		}
		if (position == 0) {
			addFirst(data);
		} else if (position == size) {
			addLast(data);
		} else {
			Node<T> newNode = new Node<>(data);
			Node<T> current = head;
			for (int i = 0; i < position - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
			size++;
		}
	}

	public T removeAt(int position) {
		if (position < 0 || position >= size) {
			System.out.println("Index out of bound exception");
			throw new IndexOutOfBoundsException();
		}
		if (position == 0) {
			return removeFirst();
		} else if (position == size - 1) {
			return removeLast();
		} else {
			Node<T> current = head;
			for (int i = 0; i < position; i++) {
				current = current.next;
			}
			T data = current.data;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			size--;
			return data;
		}
	}

	public void printInForwardDirection() {
		Node<T> current = head;
		System.out.print("Forward directional : [");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("]");
	}

	public void printInBackwardDirection() {
		Node<T> current = tail;
		System.out.print("Backward directional : [");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Doublylinkedlist<Integer> list = new Doublylinkedlist<>();

		list.addFirst(10);
		list.printInForwardDirection();

		list.addLast(20);
		list.addFirst(30);
		list.printInForwardDirection();

		list.insertAt(40, 0);
		list.insertAt(50, 0);
		list.insertAt(60, 2);
		list.insertAt(70, 3);

		list.printInForwardDirection();
		list.printInBackwardDirection();

		list.removeFirst();
		list.printInForwardDirection();

		list.removeLast();
		list.printInForwardDirection();

		list.removeAt(3);
		list.printInForwardDirection();
	}
}
