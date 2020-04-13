package dsaWeek4;

interface Iterator {
	public boolean hasNext();
	public Object next();
}

public class DSALinkedList {
	//field
	public DSAListNode head = new DSAListNode();
	DSAListNode last = new DSAListNode();
	public int size = 0;
	
	//constructors
	DSALinkedList() {
		head.value = "head";
	}
	
	// mutators
	public void insertFirst(Object inValue) {
		DSAListNode newNode = new DSAListNode(inValue);
		if (isEmpty() == true) {
			head.setNext(newNode);
			last.setNext(newNode);
		}
		else {
			newNode.next = head.next;
			newNode.getNext().setPrevious(newNode);
			head.next = newNode;
			newNode.previous = head;
		}
		size++;
	}
	
	public void insertLast(Object inValue) {
		
		if (isEmpty() == true) {
			insertFirst(inValue);
		}
		else {
			DSAListNode newNode = new DSAListNode(inValue);
			last.getNext().setNext(newNode);
			newNode.setPrevious(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	
	public void removeFirst() {
		if ( isEmpty() == true) {
			System.out.println("error"); //@@@@@@@@@@@@@@@@ exception has to be added here.
		}
		else {
			head.next = head.getNext().next;
		}
		size--;
	}
	
	public void removeLast() {
		if (isEmpty() == true) {
			System.out.println("error"); //@@@@@@@@@@@@@@@@@@@@@@ exception has to be added here.
		}
		else {
			last.next = last.getNext().previous;
		}
		size--;
	}
	
	
	//accessors
	public boolean isEmpty() {
		boolean empty = false;
		if(head.next == null) {
			empty = true;
		}
		return empty;
	}
	
	public Object peekFirst() {
		if (isEmpty() == true) {
			System.out.println("Error");
		}
		Object firstValue = head.getNext().value;
		return firstValue;
	}
	
	public Object peekLast() {
		if (isEmpty() == true) {
			System.out.println("Error");
		}
		Object lastValue = last.getNext().value;
		return lastValue;
	}
	
	/*
	public class MyLinkedList implements Iterable {
		
	}
	*/
	
	public Iterator iterator() {
		return new Ite();
	}

	class Ite implements Iterator{

		private DSAListNode lastReturned;
		private DSAListNode next;
		private int nextIndex;
		
		Ite() { //constructor
			next =head.next;
			nextIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			boolean BHasNext = false;
			if(nextIndex < size) {
				BHasNext = true;
			}
			return BHasNext;
		}
		
		@Override
		public Object next() { //DSAListNode 를 Object 로 바꿔야 하는지
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.value;
		}
		
	}
}
