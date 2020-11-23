package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class QueueTest {

    // ----------------------------------- Test Queue -----------------------------------
    @Test
    public void testQueueEnqueue() {
        // initialize
        Queue queue = new Queue(new ImmutableLinkedList());
        Object expectedResult = 1;
        Object newNode = 1;
        queue.enqueue(newNode);

        // preform operations
        Object actualResult = queue.peek();

        assertNotNull(actualResult);
    }

    @Test
    public void testQueueDequeue() {
        // initialize
        Queue queue = new Queue(new ImmutableLinkedList(new Object[] {1, 2, 3}));

        Object expectedResult = 1;

        // preform operations
        Object actualResult = queue.dequeue();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testQueuePeek() {
        // initialize
        Queue queue = new Queue(new ImmutableLinkedList(new Object[] {1, 2, 3}));

        Object expectedResult = 1;

        // preform operations
        Object actualResult = queue.peek();

        assertEquals(expectedResult, actualResult);
    }


}
