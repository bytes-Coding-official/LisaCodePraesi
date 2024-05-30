package datenstrukturen;

public class ListNode<E> {

    private E value;
    private ListNode next;
    private ListNode prev;

    public ListNode(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
