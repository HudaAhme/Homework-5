/**
 * Created by DELL on 08/03/2023.
 */
public class question {
    public int size() {
        Node<AnyType> tmp = head;
        int size = 0;
        if (head == null) {
            return size;
        } else {
            size++;
            while (tmp.next != null) {
                tmp = tmp.next;
                size++;
            }
        }
        return size;

    }}
