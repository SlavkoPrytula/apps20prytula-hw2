package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.Node;


public class Stack extends ImmutableLinkedList {
    private ImmutableLinkedList stack;

    public Stack(ImmutableLinkedList stack) {
        this.stack = stack;
    }

    public Object peek() {
        // Returns the object from the top of the Stack without removing it
        return stack.getFirst();
    }

    public Object pop() {
        // Removes and returns the object from the top of the Stack
        Object node = getFirst();
        stack = removeFirst();
        return node;

    }

    public void push(Object e) {
        // Adds an object to the the top of the Stack
        stack = addLast(e);
    }



}
