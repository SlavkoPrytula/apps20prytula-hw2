package ua.edu.ucu.collections.immutable;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ImmutableLinkedList<E> implements ImmutableList {
    private Node<Object> head;
    private final Node<Object> tail;
    public static int size = 0;
    private final ImmutableList linkedList
            = new ImmutableLinkedList<Object>(null,
                                                null);

    public ImmutableLinkedList(Node<Object> head, Node<Object> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node<Object> getHead() {
        return head;
    }

    public Node<Object> getTail() {
        return tail;
    }

    @Override
    public ImmutableList add(Object e) {
        Node<Object> newNode = new Node<>(e, tail, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        size++;

        return linkedList;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }

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
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<Object> node = head;
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                node.previous.next = node.next;
                node.item = null;
                size--;
                return linkedList;
            }
            node = node.next;
        }
        return linkedList;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        Node<Object> node = head;
        for (int i = 0; i < size(); i++) {
            if (node.equals(e)) {
                return i;
            }
            node = node.next;
        }
//        throw new Exception("no item found");
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
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
        if (head == null)
            throw new NoSuchElementException();
        return head.item;
    }
    public Object getLast() {
        // gets the last element in the linked list
        if (tail == null)
            throw new NoSuchElementException();
        return tail.item;
    }

    public ImmutableLinkedList removeFirst() {
        // deletes the first element from the linked list

    }

    public ImmutableLinkedList removeLast() {
        // deletes the last element from the linked list
    }


}
