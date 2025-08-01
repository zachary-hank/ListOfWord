package models;

public class ListOfWord {
	private Node head;
	
	public ListOfWord() {
		head = null;
	}
	
	//method returns true if word added to list, false if not/word already in list
	public boolean addWord(String word) {
		word = word.replaceAll("\\p{P}", "").toLowerCase();
		if (getWord(word) != null) return false;
		Node newNode = new Node(word);
		newNode.setNext(head);
		head = newNode;
		return true;
	}
	
	public String getWord(String word) {
		if (head == null) return null;
		word = word.replaceAll("\\p{P}", "").toLowerCase();
		Node current = head;
		while (current != null) {
			if (current.getWord().equalsIgnoreCase(word)) return word;
			current = current.getNext();
		}
		return null;
	}
	
	public boolean removeWord(String word) {
		if (head == null) return false;
		word = word.replaceAll("\\p{P}", "").toLowerCase();
		if (head.getWord().equalsIgnoreCase(word)) {
			head = head.getNext();
			return true;
		}
		Node current = head;
		while (current.getNext() != null) {
			if (current.getNext().getWord().equalsIgnoreCase(word)) {
				current.setNext(current.getNext().getNext());
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public void printAllWords() {
		if (head == null) System.out.println("List is empty");
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.toString() + ", ");
				current = current.getNext();
			}
			System.out.println("null");
		}
	}
}
