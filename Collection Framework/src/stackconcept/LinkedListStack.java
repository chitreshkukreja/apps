package stackconcept;

public class LinkedListStack {

	Node head;

	class Node {
		int data;
		Node next;
	}

	public LinkedListStack() {
		head = null;
	}

	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.data = value;
		head.next = extraHead;
	}

	public int pop() {

		if (head == null) {
			System.out.println("stack is empty");
		} else {
			int value = head.data;
			head = head.next;
			return value;
		}

		return -1;
	}

	public static void main(String[] args) {
		LinkedListStack ll = new LinkedListStack();

		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(60);
		ll.push(90);

		System.out.println("element removed or popped from stack " + ll.pop());
		System.out.println("element removed or popped from stack " + ll.pop());
	}
}
