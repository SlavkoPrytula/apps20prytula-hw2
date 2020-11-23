package ua.edu.ucu.collections.immutable;

import java.util.NoSuchElementException;

public class ImmutableLinkedList implements ImmutableList {
    private Node<Object> head;
    private Node<Object> tail;
    public int size;
//    private final ImmutableList linkedList
//            = new ImmutableLinkedList(null,
//            null);

    public ImmutableLinkedList(Node<Object> head, Node<Object> tail) {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public ImmutableLinkedList(Object[] c) {
        this();
        addAll(c);
    }

    public ImmutableLinkedList() { // ??
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
//        Node<Object> newNode = new Node<>(e, tail, null);
//        if (tail == null) {
//            head = newNode;
//        } else {
//            tail.next = newNode;
//        }
//        size++;
        add(size(), e);

        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        // adds a new node the linked list at a given position
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<Object> node = head;
        Node<Object> newNode = new Node<>(e, null, null);
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;

        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        // adds a new objects the linked list
//        if (size() == 0) {
//            tail.item = new Node<>(c[0], null, null); // create first node
//            head = tail;
//        } else {
//            tail.next = new Node<>(c[0], null, tail);
//        }
//        for (int i = 1; i < c.length; i++) {
//            tail.next = new Node<>(c[i], null, tail);
//        }
        addAll(0, c);
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        // adds a new objects the linked list stating from a given position
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = size(); i < c.length; i++) {
            add(i, c[i - size()]); // add element on the index++
        }
        return null;
//        Node<Object> node = head;
//
//        if (size() == 0) {
//            head = new Node<>(c[0], null, null); // create first node
//            head = tail;
//        } else {
//            for (int i = 0; i < index - 1; i++) {
//                node = node.next;
//            }
//        }
//        node.next = new Node<>(c[0], null, tail);
//
//        for (int i = 1; i < c.length; i++) {
//            node.next = new Node<>(c[i], null, tail);
//        }
//        return null;
    }

    @Override
    public Object get(int index) {
        // gets the item at a given index
        Node<Object> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
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
                break;
            }
            node = node.next;
        }
        size--;
        return null;
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
        // clears the linked list
        for (Node<Object> node = head; node != null;) {
            Node<Object> next = node.next;
            node.item = null;
            node.next = null;
            node.previous = null;
            node = next;
        }
        head = tail = null;
        size = 0;
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
        Node<Object> firstNode = head;
        Node<Object> newNode = new Node<>(e, firstNode, null);
        head = newNode;
        if (firstNode == null) {
            tail = newNode;
        } else {
            newNode.next = firstNode;
            firstNode.previous = newNode;
        }
        size++;
        return null;
    }

    public ImmutableLinkedList addLast(Object e) {
        // adds an element to the beginning of the linked list
        Node<Object> lastNode = tail;
        Node<Object> newNode = new Node<>(e, null, lastNode);
        tail = newNode;
        if (lastNode == null) {
            head = newNode;
        } else {
            newNode.previous = lastNode;
            lastNode.next = newNode;
        }
        size++;
        return null;
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
        remove(0);
        return null;
    }

    public ImmutableLinkedList removeLast() {
        // deletes the last element from the linked list
        remove(size());
        return null;
    }


}
