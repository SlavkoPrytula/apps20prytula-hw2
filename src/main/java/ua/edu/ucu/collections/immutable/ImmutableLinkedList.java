package ua.edu.ucu.collections.immutable;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ImmutableLinkedList<E> implements ImmutableList {
    private Node<Object> head;
    private final Node<Object> tail;
    public int size;
    private final ImmutableList linkedList
            = new ImmutableLinkedList<Object>(null,
                                                null);

    public ImmutableLinkedList(Node<Object> head, Node<Object> tail) {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public Node<Object> getHead() {
        // returns the head of the linked list
        return head;
    }

    public Node<Object> getTail() {
        // returns the tail of the linked list
        return tail;
    }

    @Override
    public ImmutableList add(Object e) {
        // adds a new node the linked list
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
        // adds a new node the linked list at a given position
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<Object> node = head;
        Node<Object> newNode = new Node<>(e, tail, null);
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        newNode.previous = node.previous;
        newNode.next = node; // do we have to destroy the previous connections ??
        node.previous = newNode;


        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        // adds a new objects the linked list
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        // adds a new objects the linked list stating from a given position
        return null;
    }

    @Override
    public Object get(int index) {
        // gets the item at a given index
        return null;
    }

    @Override
    public ImmutableList remove(int index) {
        // removes an element at a given index
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
        // sets the new object to the node in the linked list
        Node<Object> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.item = e;
        return null;
    }

    @Override
    public int indexOf(Object e) {
        // returns the index of the element in the linked list
        Node<Object> node = head;
        for (int i = 0; i < size(); i++) {
            if (node.equals(e)) {
                return i;
            }
            node = node.next;
        }
////        throw new Exception("no item found");
        return 0;
    }

    @Override
    public int size() {
        // returns the size of the linked list
        return size;
    }

    @Override
    public ImmutableList clear() {
        // clears the limked list
        return null;
    }

    @Override
    public boolean isEmpty() {
        // return true/false according if the linked list is empty
        return size() == 0;
    }

    @Override
    public Object[] toArray() {
        // ??converts the linked list to the linked array
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
