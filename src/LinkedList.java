
public class LinkedList<T extends Comparable<T>> {
	Node<T> head;
	public void addElement(T data) {
		if(head == null) {
			//first element
			head = new Node<>(data);
		}
		else {
			Node<T> tempNode = new Node<>(data);
			tempNode.next = head;
			head = tempNode;
		}
	}
	public void printSequence() {
		System.out.println("------------------");
		Node<T> iterator = head;
		if(head == null) {
			System.out.println("Empty List");
		}
		else {
			while(iterator != null) {
				System.out.println(iterator.data);
				iterator = iterator.next;
			}
		}
		System.out.println("------------------");
	}
	public void addElementAfter(T data, T element) {
		if(head == null) {
			System.out.println("Empty List");
		}
		else {
			Node<T> iterator = head;
			Node<T> newElement = new Node<>(data);
			while(iterator != null) {
				if(iterator.data.equals(element)) {
					newElement.next = iterator.next;
					iterator.next = newElement;
					break;
				}
				iterator = iterator.next;
			}
		}
	}
	
	void pop() {
		if(head == null) {
			System.out.println("Empty List");
		}
		else {
			Node<T> tempNode = head;
			head = head.next;
			tempNode.next = null;
		}
	}

}
