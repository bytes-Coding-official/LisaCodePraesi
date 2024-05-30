package datenstrukturen;

public class Queue {

    //create a queue datastructure
    //create a head
    //create a tail
    //create a size
    //create a enqueue
    //create a dequeue
    //create a peek
    //create a isEmpty


    private QueueNode head;
    private QueueNode tail;
    private int size;

    public Queue(QueueNode head, QueueNode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public QueueNode getHead() {
        return head;
    }

    public void setHead(QueueNode head) {
        this.head = head;
    }

    public QueueNode getTail() {
        return tail;
    }

    public void setTail(QueueNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(QueueNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }


    public QueueNode dequeue() {
        if (head == null) {
            return null;
        } else {
            QueueNode node = head;
            head = head.getNext();
            size--;
            return node;
        }
    }


    public QueueNode peek() {
        if (head == null) {
            return null;
        } else {
            return head;
        }
    }


    public boolean isEmpty() {
        return head == null;
    }


}
