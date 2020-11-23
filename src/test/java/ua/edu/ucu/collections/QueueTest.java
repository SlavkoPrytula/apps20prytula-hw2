//package ua.edu.ucu.collections;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class QueueTest {
//
//    // ----------------------------------- Test Queue -----------------------------------
//    @Test
//    public void testQueueEnqueue() {
//        // initialize
//        Queue queue = new Queue(null, null);
//        Object expectedResult = 2;
//        Object newNode = 1;
//        queue.enqueue(expectedResult);
//        queue.enqueue(newNode);
//
//        // preform operations
//        Object actualResult = queue.peek();
//        System.out.println(queue.head);
//
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testQueueDequeue() {
//        // initialize
//        Queue queue = new Queue(null, null);
//
//        Object expectedResult = 2;
//        Object newNode = 1;
//        queue.enqueue(expectedResult);
//        queue.enqueue(newNode);
//
//
//        // preform operations
//        Object actualResult = queue.dequeue();
//
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testQueuePeek() {
//        // initialize
//        Queue queue = new Queue(null, null);
//
//        Object expectedResult = 2;
//        Object newNode = 1;
//        queue.enqueue(expectedResult);
//        queue.enqueue(newNode);
//
//
//        // preform operations
//        Object actualResult = queue.peek();
//
//        assertEquals(expectedResult, actualResult);
//    }
//
//
//}
