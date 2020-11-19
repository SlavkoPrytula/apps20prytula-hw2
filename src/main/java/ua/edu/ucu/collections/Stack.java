package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.Node;


public class Stack extends ImmutableLinkedList {
    public final Node<Object> head;
    public final Node<Object> tail;

    public Stack(Node<Object> head, Node<Object> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Object peek() {
        // Returns the object from the top of the Stack without removing it
        Node<Object> node = head;
        return (node == null) ? null : node.item;
    }

    public Object pop() {
        // Removes and returns the object from the top of the Stack
        Object node = getFirst();
        removeFirst();
        return node;

    }

    public void push(Object e) {
        // Adds an object to the the top of the Stack
        addFirst(e);
    }



}
