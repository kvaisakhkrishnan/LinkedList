
public class LinkedList<T> {
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
	}

}
