package stackconcept;

public class QueueArrayImpl {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	public QueueArrayImpl(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	// used to add element in the queue at back
	public void enqueue(int data) {

		if (isFull()) {
			System.out.println("hey queue is full, cannot insert data");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println("Data Added to queue");
		}
	}

	// this method is used to remove element from the front of the queue
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Hey queue is empty cannot delete element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0)
			return true;
		return false;
	}
}
