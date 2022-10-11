package stackconcept;

public class StackImpl {

	int size;
	int arr[];
	int top;

	StackImpl(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public int pop() {
		if (!isEmpty()) {
			int returnTop = arr[top];
			top--;
			return returnTop;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("push element : " + element);
		} else {
			System.out.println("stack is full");
		}
	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackImpl stackImpl = new StackImpl(10);
		stackImpl.pop();
		System.out.println("===========");
		stackImpl.push(100);
		stackImpl.push(200);
		stackImpl.push(300);
		stackImpl.push(400);
		System.out.println("===============");
		System.out.println(stackImpl.peek());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.isEmpty());
		System.out.println(stackImpl.isFull());
	}
}
