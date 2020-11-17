package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList<E> implements ImmutableList {
    private final Node<E> head;
    private final Node<E> tail;

    public ImmutableLinkedList(Node<E> head, Node<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public ImmutableList add(Object e) {
        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public ImmutableList remove(int index) {
        return null;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public ImmutableLinkedList addFirst(Object e) {
        // adds an element to the beginning of the linked list
    }

    public ImmutableLinkedList addLast(Object e) {
        // adds an element to the beginning of the linked list
    }

    public Object getFirst() {
        // gets the first element in the linked list
    }
    public Object getLast() {
        // gets the last element in the linked list
    }

    public ImmutableLinkedList removeFirst() {
        // deletes the first element from the linked list
    }

    public ImmutableLinkedList removeLast() {
        // deletes the last element from the linked list
    }


}
