package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.Node;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;


public class Queue {

    private ImmutableLinkedList queue;

    public Queue(ImmutableLinkedList queue) {
        this.queue = queue;
    }

    public Object peek() {
        // Returns the object at the beginning of the Queue without removing it
        return queue.getFirst();
    }

    public Object dequeue() {
        // Removes and returns the object at the beginning of the Queue
        Object node = queue.getFirst();
        queue = queue.removeFirst();
        return node;
    }

    public void enqueue(Object e) {
        // Adds an object to the end of the Queue
        queue = queue.addLast(e);
    }


}
