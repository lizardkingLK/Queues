class Queue {
	private int size, front, items, rear;
	private int[] queue;
	
	public Queue(int size) {
		this.size = size;
		this.front = 0;
		this.rear = -1;
		this.items = 0;
		this.queue = new int[size];
		System.out.println("Queue Initialized!");
	}
	
	public void insert(int x) {
		if (rear == size - 1) {
			System.out.println("Queue Already Full!");
		}
		else {
			rear++;
			queue[rear] = x;
			items++;
			System.out.println(x + " Inserted to queue");
		}
	}
	
	public void delete() {
		if (items == 0) {
			System.out.println("Queue is Empty!");
		}
		else {
			int frontItem = queue[front];
			front++;
			items--;
			System.out.println(frontItem + " Deleted from queue");
		}
	}
	
	public void peek() {
		if (items == 0) {
			System.out.println("Queue is Empty!");
		}
		else {
			int frontItem = queue[front];
			System.out.println(frontItem + " is in front of queue");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.insert(4);
		
		queue.peek();
		
		queue.insert(3);
		queue.insert(8);
		queue.insert(-3);
		queue.insert(7);
		
		queue.insert(9);
		
		queue.delete();
		
		queue.peek();
	}
}