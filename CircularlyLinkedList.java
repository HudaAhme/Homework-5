/**
 * Created by DELL on 08/03/2023.
 */
public class CircularlyLinkedList<E> {
    private Node head;

    public static void main(String[] args)
            throws CloneNotSupportedException
    { CircularlyLinkedList<String> circularList = new CircularlyLinkedList<String>();
        circularList.addFirst("1");
        circularList.addLast("2");
        circularList.addLast("3");
        circularList.addLast("4");
        CircularlyLinkedList<String> newList = new CircularlyLinkedList<String>();
        newList= circularList.clone();
        System.out.println(newList); }

    private void addLast(E s) {

    }

    private void addFirst(E s) {

    }

    @SuppressWarnings("unchecked") public CircularlyLinkedList<E> clone()
            throws CloneNotSupportedException {
        CircularlyLinkedList<E> other = (CircularlyLinkedList<E>) super.clone();
        boolean size = false;
        if (size > 0) {
            other.head = new Node<>(head.getElement(), null);
            Node<E> walk = head.getNext();
            Node<E> otherTail = other.head;
            while (walk != null) {
                Node<E> newest = new Node<>(walk.getElement(), null);
            }
            Node<E> newest;
            otherTail.setNext(newest);
            otherTail = newest;
            walk = walk.getNext();
        } }
    return other;
}

