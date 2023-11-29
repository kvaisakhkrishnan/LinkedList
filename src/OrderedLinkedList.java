public class OrderedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void addElement(T element) {
        if (head == null) {
            head = new Node<T>(element);
        } else {
            Node<T> tempHead = head;

            if (head.data.compareTo(element) > 0) {
                Node<T> tempData = new Node<T>(element);
                tempData.next = head;
                head = tempData;
            } else {
                while (tempHead.next != null && tempHead.next.data.compareTo(element) <= 0) {
                    tempHead = tempHead.next;
                }

                Node<T> tempData = new Node<T>(element);
                tempData.next = tempHead.next;
                tempHead.next = tempData;
            }
        }
    }

    public void showElements() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node<T> tempHead = head;
            while (tempHead != null) {
                System.out.println(tempHead.data);
                tempHead = tempHead.next;
            }
        }
    }
}
