package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.Node;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;


public class Queue extends ImmutableLinkedList {
    public final Node<Object> head;
    public final Node<Object> tail;

    public Queue(Node<Object> head, Node<Object> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Object peek() {
        // Returns the object at the beginning of the Queue without removing it
        Node<Object> node = head;
        return (node == null) ? null : node.item;
    }

    public Object dequeue() {
        // Removes and returns the object at the beginning of the Queue
        Object node = getFirst();
        removeFirst();
        return node;
    }

    public void enqueue(Object e) {
        // Adds an object to the end of the Queue
        addLast(e);
    }


}
