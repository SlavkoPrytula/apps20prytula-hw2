package ua.edu.ucu.collections.immutable;

import java.util.NoSuchElementException;

public class ImmutableLinkedList implements ImmutableList {
    private final Node head;
    private final Node tail;
    private final Node[] linkedList;

    public ImmutableLinkedList(Object[] c) {
        this.linkedList = new Node[c.length];
        for (int i = 0; i < c.length; i++) {
            linkedList[i] = new Node(c[i]);
        }
        this.head = linkedList[0];
        this.tail = linkedList[linkedList.length - 1];
    }

    public ImmutableLinkedList() {
        this.linkedList = new Node[0];
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        // returns the head of the linked list
        return head;
    }

    public Node getTail() {
        // returns the tail of the linked list
        return tail;
    }

    @Override
    public ImmutableLinkedList add(Object e) {
        // adds a new node the linked list
        return add(size(), e);
    }

    @Override
    public ImmutableLinkedList add(int index, Object e) {
        // adds a new node the linked list at a given position
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node[] newList = new Node[size() + 1];
        Node newNode = new Node(e);

        if (size() == 0) {
            newList[newList.length - 1] = newNode;
            return new ImmutableLinkedList(newList);
        }

        System.arraycopy(linkedList, 0, newList, 0, size());
        System.arraycopy(newList, index, newList, index + 1, size() - index);
        newList[index] = newNode;

        for (int i = 0; i < size() - 1; i++) {
            linkedList[i].next = linkedList[i + 1];
        }

        return new ImmutableLinkedList(newList);
    }

    @Override
    public ImmutableLinkedList addAll(Object[] c) {
        // adds a new objects the linked list
        return addAll(0, c);
    }

    @Override
    public ImmutableLinkedList addAll(int index, Object[] c) {
        // adds a new objects the linked list stating from a given position
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ImmutableLinkedList newList = new ImmutableLinkedList();
        for (int i = size(); i < c.length; i++) {
            newList = add(i, c[i - size()]); // add element on the index++
        }
        return newList;
    }

    @Override
    public Object get(int index) {
        // gets the item at a given index
        Node node = getHead();
        if (node == null) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    @Override
    public ImmutableLinkedList remove(int index) {
        // removes an element at a given index
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node[] newList = new Node[size()];
        System.arraycopy(linkedList, 0, newList, 0, size());

        for (int i = 0; i < size(); i++) {
            if (i == index) {
                newList[i].item = null;
                break;
            }
        }
        return new ImmutableLinkedList(newList);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        // sets the new object to the node in the linked list
        Node[] newList = new Node[size()];
        System.arraycopy(linkedList, 0, newList, 0, size());
        newList[index].item = e;
        return null;
    }

    @Override
    public int indexOf(Object e) {
        // returns the index of the element in the linked list
        Node node = getHead();
        for (int i = 0; i < size(); i++) {
            if (node.equals(e)) {
                return i;
            }
            node = node.next;
        }
        return 0;
    }

    @Override
    public int size() {
        // returns the size of the linked list
        return linkedList.length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        // return true/false according if the linked list is empty
        return size() == 0;
    }

    @Override
    public Object[] toArray() {
        // converts the linked list to the linked array
        Object[] obj = new Object[size()];
        System.arraycopy(linkedList, 0, obj, 0, size());
        for (int i = 0; i < size(); i++) {
            if (obj[i] != null) {
                Node node = new Node(obj[i]);
                obj[i] = node.item;
            }
        }
        return obj;
    }

    public ImmutableLinkedList addFirst(Object e) {
        // adds an element to the beginning of the linked list
        return add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        // adds an element to the beginning of the linked list
        return add(size() - 1, e);
    }

    public Object getFirst() {
        // gets the first element in the linked list
        if (getHead() == null) {
            throw new NoSuchElementException();
        }
        return get(0);
    }
    public Object getLast() {
        // gets the last element in the linked list
        if (getTail() == null) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    public ImmutableLinkedList removeFirst() {
        // deletes the first element from the linked list
        return remove(0);
    }

    public ImmutableLinkedList removeLast() {
        // deletes the last element from the linked list
        return remove(size() - 1);
    }


}
