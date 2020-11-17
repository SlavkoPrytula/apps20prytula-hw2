package ua.edu.ucu.collections.immutable;

public class Node<E> {
    private final E item;
    private final Node<E> previous;
    private final Node<E> next;

    public Node(E item, Node<E> previous, Node<E> next) {
        this.item = item;
        this.previous = previous;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }
}
