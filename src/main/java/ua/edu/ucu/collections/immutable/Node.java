package ua.edu.ucu.collections.immutable;

public class Node {
    private final Object item;
    private final Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Object getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }
}
