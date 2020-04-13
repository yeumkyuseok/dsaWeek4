package dsaWeek4;

public class DSAQueue {

		//fields and constants
	DSALinkedList queue = new DSALinkedList();
	
	DSAQueue() {
		
	}
	
	
	//accessors
	
	Boolean isEmpty() {
		boolean empty = false;
		if (queue.isEmpty()) {
			empty = true;
		}
		return empty;
	}

	Object peek() {
		Object first;
		if (isEmpty() == true) {
			//ADD EXCEPTION
			first = 0;
		}
		else {
			first = queue.head.next.value;
		}
		return first;
	}
	
	//mutators
	void enqueue(Object value) {
		queue.insertLast(value);
	}
	
	Object dequeue() {
		Object first=queue.head.next.value;
		queue.removeFirst();
		return first;
	}
	
}


















