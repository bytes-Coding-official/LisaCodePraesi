package datenstrukturen;

public class Stack {
    //create a stack

    //create a head
    //create a size
    //create a push
    //create a pop
    //create a peek
    //create a isEmpty


    private StackNode head;
    private int size;

    public Stack(StackNode head, int size) {
        this.head = head;
        this.size = size;
    }

    public StackNode getHead() {
        return head;
    }

    public void setHead(StackNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(StackNode node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public StackNode pop() {
        if (head == null) {
            return null;
        } else {
            StackNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
            return temp;
        }

    }

    public StackNode peek() {
        if (head == null) {
            return null;
        } else {
            return head;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }


}
