
public class Driver {
	public static void main(String[] args) {
		LinkedList<Integer> intLinkedList = new LinkedList<>();
		intLinkedList.addElement(70);
		intLinkedList.addElement(30);
		intLinkedList.addElement(56);
		intLinkedList.printSequence();
		intLinkedList.addElementAfter(10, 30);
		intLinkedList.printSequence();
	}
}
