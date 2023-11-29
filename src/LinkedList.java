
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
	void deleteLast() {
		if(head == null) {
			System.out.println("Empty List");
		}
		else {
			Node<T> tempNode = head;
			if(head.next == null) {
				head = null;
				return;
			}
			while(tempNode.next.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = null;
		}
	}
	void searchElement(T element) {
		if(head == null) {
			System.out.println("Empty List");
		}
		Node<T> tempHead = head;
		while(tempHead.next != null) {
			if(tempHead.data.equals(element)) {
				System.out.println("Element Found");
				tempHead = tempHead.next;
			}
		}
	}
	void deleteElement(T element) {
		if(head == null) {
			System.out.println("Empty List");
		}
		else {
			Node<T> tempHead = head;
			if(head.data.equals(element)) {
				head = null;
				System.out.println("Size is : 0");
			}
			else {
				int count = 1;
				boolean flag = false;
				while(tempHead.next != null) {
					if(tempHead.next.data.equals(element) && flag == false) {
						tempHead.next = tempHead.next.next;
						flag = true;
					}
					count += 1;
				}
				System.out.println("Size is : " + (count - 1));
			}
		}
	}

}
