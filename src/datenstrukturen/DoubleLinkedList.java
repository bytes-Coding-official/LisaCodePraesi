package datenstrukturen;

public class DoubleLinkedList<E> {
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        ListNode<E> newNode = new ListNode<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public boolean remove(E element) {
        if (isEmpty()) {
            return false;
        }

        ListNode<E> current = head;

        while (current != null) {
            if (current.getValue().equals(element)) {
                if (current == head) {
                    head = current.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                } else if (current == tail) {
                    tail = current.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }

                size--;
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    public boolean contains(E element) {
        ListNode<E> current = head;
        while (current != null) {
            if (current.getValue().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        ListNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }
}






