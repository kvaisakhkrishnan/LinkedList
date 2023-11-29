
public class Driver {
	public static void main(String[] args) {
		LinkedList<Integer> intLinkedList = new LinkedList<>();
		intLinkedList.addElement(70);
		intLinkedList.addElement(30);
		intLinkedList.addElement(56);
		intLinkedList.printSequence();
		intLinkedList.addElementAfter(10, 30);
		intLinkedList.printSequence();
		intLinkedList.pop();
		intLinkedList.printSequence();
		intLinkedList.deleteLast();
		intLinkedList.printSequence();
		intLinkedList.searchElement(30);
		intLinkedList.deleteElement(10);
		intLinkedList.printSequence();
		
		OrderedLinkedList<Integer> orderedList = new OrderedLinkedList<>();
		orderedList.addElement(56);
		orderedList.addElement(30);
		orderedList.addElement(40);
		orderedList.addElement(70);
		orderedList.showElements();
	}
}
