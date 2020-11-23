package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class StackTest {

    // ----------------------------------- Test Stack -----------------------------------
    @Test
    public void testStackPush() {
        // initialize
        Stack stack = new Stack(new ImmutableLinkedList());

        Object expectedResult = 2;
        Object newNode = 1;

        // preform operations
        stack.push(newNode);
        stack.push(expectedResult);
        Object actualResult = stack.peek();

        assertNotNull(actualResult);
    }

    @Test
    public void testStackPop() {
        // initialize
        Stack stack = new Stack(new ImmutableLinkedList(new Object[] {1, 2, 3}));

        Object expectedResult = 1;

        // preform operations
        Object actualResult = stack.pop();

        assertNotNull(actualResult);
    }

    @Test
    public void testStackPeek() {
        // initialize
        Stack stack = new Stack(new ImmutableLinkedList(new Object[] {1, 2, 3}));

        Object expectedResult = 1;

        // preform operations
        Object actualResult = stack.peek();

        assertEquals(expectedResult, actualResult);
    }
}
