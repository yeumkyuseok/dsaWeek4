package dsaWeek4;

public class DSAStack{
	
	//class fields and constants
	public DSALinkedList stack = new DSALinkedList();

	
	//default constructor
	DSAStack() {
	}

	
	//accessors
	boolean isEmpty() {
		boolean empty = false;
		if (stack.head.next == null) {
			empty = true;
		}
		return empty;
	}
	
	
	Object top() {
		Object topVal;
		if (isEmpty()==true) {
			topVal="string is empty";
			//ADD EXCEPTION
		}
		else {
			topVal = stack.last.next.value;
		}
		return topVal;
	}
	
	//mutators
	void push(Object value) {
		this.stack.insertFirst(value);
	}
	
	Object pop() {
		Object topVal = stack.last.next.value;
		stack.removeFirst();
		return topVal;
	}
	
}

















