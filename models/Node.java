package models;

public class Node {
	private final String word;
	private Node next;
	
	public Node(String word) {
		this.word = word;
		next = null;
	}

	public String getWord() {
		return word;
	}

	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		String nextNode = (next != null)? next.getWord():"null";
		return "Node [word=" + word + ", next=" + nextNode + "]";
	}
	
}
