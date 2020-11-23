//package ua.edu.ucu.collections;
//
//import org.junit.Test;
//import ua.edu.ucu.collections.immutable.Node;
//
//import static org.junit.Assert.*;
//
//public class StackTest {
//
//    // ----------------------------------- Test Stack -----------------------------------
//    @Test
//    public void testStackPush() {
//        // initialize
//        Stack stack = new Stack(null, null);
//
//        Object expectedResult = 2;
//        Object newNode = 1;
//
//        // preform operations
//        stack.push(newNode);
//        stack.push(expectedResult);
//        Object actualResult = stack.peek();
//
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testStackPop() {
//        // initialize
//        Stack stack = new Stack(null, null);
//
//        Object expectedResult = 2;
//        Object newNode = 1;
//        stack.push(newNode);
//        stack.push(expectedResult);
//
//        // preform operations
//        Object actualResult = stack.pop();
//
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void testStackPeek() {
//        // initialize
//        Stack stack = new Stack(null, null);
//
//        Object expectedResult = 2;
//        Object newNode = 1;
//        stack.push(newNode);
//        stack.push(expectedResult);
//
//        // preform operations
//        Object actualResult = stack.peek();
//
//        assertEquals(expectedResult, actualResult);
//    }
//}
