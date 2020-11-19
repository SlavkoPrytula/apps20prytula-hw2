package ua.edu.ucu.collections.immutable;

public class Node<E> {
    public E item;
    public Node<E> previous;
    public Node<E> next;

    public Node(E item, Node<E> next, Node<E> previous) {
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
