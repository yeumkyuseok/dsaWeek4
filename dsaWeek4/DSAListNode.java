package dsaWeek4;

public class DSAListNode {
	public Object value;
	public DSAListNode next, previous;
	
	public DSAListNode() {
		value = null;
		next = null;
		previous = null;
	}
	public DSAListNode(Object invalue) {
		this.value = invalue;
		this.next = null;
		previous = null;
	}
	
	public void setNext(DSAListNode newNext) {
		this.next = newNext;
	}
	
	public DSAListNode getNext() {
		return this.next;
	}
	
	public void setPrevious(DSAListNode newPrevious) {
		this.previous = newPrevious;
	}
	
	public DSAListNode getPrevious() {
		return this.previous;
	}
}
